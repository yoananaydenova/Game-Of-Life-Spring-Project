package com.yoanan.gameoflifespring.model.binding;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LiveCellCoordinatesBindingModel {
    @JsonProperty("row_index")
    private int rowIndex;
    @JsonProperty("column_index")
    private int columnIndex;

    public LiveCellCoordinatesBindingModel() {
    }

    public LiveCellCoordinatesBindingModel(int rowIndex, int columnIndex) {
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public LiveCellCoordinatesBindingModel setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
        return this;
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public LiveCellCoordinatesBindingModel setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
        return this;
    }
}
