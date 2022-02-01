package com.yoanan.gameoflifespring.service.impl;

import com.yoanan.gameoflifespring.model.binding.GameBindingModel;
import com.yoanan.gameoflifespring.model.service.GameServiceModel;
import com.yoanan.gameoflifespring.model.service.LiveCellCoordinatesServiceModel;
import com.yoanan.gameoflifespring.service.GameService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameServiceImpl implements GameService {


    @Override
    public GameServiceModel createNextGeneration(GameBindingModel gameBindingModel) {
        int fieldNumberOfRows = gameBindingModel.getFieldDimensions().getNumberOfRows();
        int fieldNumberOfColumns = gameBindingModel.getFieldDimensions().getNumberOfColumns();


        int[][] field = new int[fieldNumberOfRows][fieldNumberOfColumns];
        gameBindingModel.getLiveCells().forEach(cell -> {

            int cellRowIndex = cell.getRowIndex();
            int cellColumnIndex = cell.getColumnIndex();

            if (cellRowIndex < 0 || cellRowIndex > fieldNumberOfRows - 1) {
                throw new IllegalArgumentException(String.format("Row index of live cell is out of bound. It must be between 0 and %d inclusive. ", fieldNumberOfRows));
            }
            if (cellColumnIndex < 0 || cellColumnIndex > fieldNumberOfColumns - 1) {
                throw new IllegalArgumentException(String.format("Column index of live cell is out of bound. It must be between 0 and %s inclusive. ", fieldNumberOfColumns));
            }
            field[cellRowIndex][cellColumnIndex] = 1;
        });

        List<LiveCellCoordinatesServiceModel> lifeCellsCoordinatesList = play(field);

        GameServiceModel game = new GameServiceModel();
        game.setNumberOfRows(fieldNumberOfRows);
        game.setNumberOfColumns(fieldNumberOfColumns);
        game.setLiveCellCoordinates(lifeCellsCoordinatesList);

        return game;
    }

    private List<LiveCellCoordinatesServiceModel> play(int[][] field) {
        int numberOfRowField = field.length;
        int numberOfColumnField = field[0].length;

        List<LiveCellCoordinatesServiceModel> liveCellCoordinates = new ArrayList<LiveCellCoordinatesServiceModel>();

        for (int row = 0; row < numberOfRowField; row++) {
            for (int col = 0; col < numberOfColumnField; col++) {

                int liveNeighbours = getLiveNeighbours(row, col, field);
                LiveCellCoordinatesServiceModel liveCellCoordinatesServiceModel;
                // if cell is LIVE
                if (field[row][col] == 1 && (liveNeighbours == 2 || liveNeighbours == 3)) {
                    liveCellCoordinatesServiceModel = new LiveCellCoordinatesServiceModel(row, col);
                    liveCellCoordinates.add(liveCellCoordinatesServiceModel);

                    // if cell is DEAD
                } else if (field[row][col] == 0 && liveNeighbours == 3) {
                    liveCellCoordinatesServiceModel = new LiveCellCoordinatesServiceModel(row, col);
                    liveCellCoordinates.add(liveCellCoordinatesServiceModel);
                }

            }
        }

        return liveCellCoordinates;
    }


    private int getLiveNeighbours(int row, int col, int[][] field) {
        int result = 0;

        int numberOfRowField = field.length;
        int numberOfColumnField = field[0].length;

        int checkRow;
        int checkCol;

        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (r == row && c == col) {
                    continue;
                }

                if (r == -1) {
                    checkRow = numberOfRowField - 1;
                } else if (r == numberOfRowField) {
                    checkRow = 0;
                } else {
                    checkRow = r;
                }

                if (c == -1) {
                    checkCol = numberOfColumnField - 1;
                } else if (c == numberOfColumnField) {
                    checkCol = 0;
                } else {
                    checkCol = c;
                }

                if (field[checkRow][checkCol] == 1) {
                    result++;
                }
            }
        }

        return result;
    }


}
