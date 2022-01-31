package com.yoanan.gameoflifespring.model.view;

public class FieldDimensionsViewModel {
    private int numberOfRows;
    private int numberOfColumns;

    public FieldDimensionsViewModel() {
    }

    public FieldDimensionsViewModel(int numberOfRows, int numberOfColumns) {
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public FieldDimensionsViewModel setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
        return this;
    }

    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    public FieldDimensionsViewModel setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
        return this;
    }
}
