package com.yoanan.gameoflifespring.model.view;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LiveCellCoordinatesViewModel {

    @JsonProperty("row_index")
    private int rowIndex;
    @JsonProperty("column_index")
    private int columnIndex;

    public LiveCellCoordinatesViewModel() {
    }

    public LiveCellCoordinatesViewModel(int rowIndex, int columnIndex) {
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public LiveCellCoordinatesViewModel setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
        return this;
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public LiveCellCoordinatesViewModel setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
        return this;
    }
}
