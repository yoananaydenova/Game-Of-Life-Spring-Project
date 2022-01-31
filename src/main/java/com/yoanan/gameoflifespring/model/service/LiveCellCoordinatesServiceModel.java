package com.yoanan.gameoflifespring.model.service;

public class LiveCellCoordinatesServiceModel {

    private int rowIndex;
    private int columnIndex;

    public LiveCellCoordinatesServiceModel() {
    }

    public LiveCellCoordinatesServiceModel(int rowIndex, int columnIndex) {
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public LiveCellCoordinatesServiceModel setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
        return this;
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public LiveCellCoordinatesServiceModel setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
        return this;
    }
}
