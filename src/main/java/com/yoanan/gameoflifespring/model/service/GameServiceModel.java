package com.yoanan.gameoflifespring.model.service;

import java.util.List;

public class GameServiceModel {
    private int numberOfRows;
    private int numberOfColumns;
    private List<LiveCellCoordinatesServiceModel> liveCellCoordinates;

    public GameServiceModel() {
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public GameServiceModel setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
        return this;
    }

    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    public GameServiceModel setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
        return this;
    }

    public List<LiveCellCoordinatesServiceModel> getLiveCellCoordinates() {
        return liveCellCoordinates;
    }

    public GameServiceModel setLiveCellCoordinates(List<LiveCellCoordinatesServiceModel> liveCellCoordinates) {
        this.liveCellCoordinates = liveCellCoordinates;
        return this;
    }
}
