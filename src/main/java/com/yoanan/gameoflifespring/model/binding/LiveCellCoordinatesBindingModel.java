package com.yoanan.gameoflifespring.model.binding;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yoanan.gameoflifespring.utils.InputValuesModel;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

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

    @Min(value = 0, message = "Index of row of live cell should not be less than 0 inclusive!")
    @Max(value = InputValuesModel.HIGH_BOUND - 1, message = "Index of row of live cell should not be more than "+ (InputValuesModel.HIGH_BOUND - 1)+" inclusive!")
    public int getRowIndex() {
        return rowIndex;
    }

    public LiveCellCoordinatesBindingModel setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
        return this;
    }

    @Min(value = 0, message = "Index of column of live cell should not be less than 0 inclusive!")
    @Max(value = InputValuesModel.HIGH_BOUND - 1, message = "Index of column of live cell should not be more than " + (InputValuesModel.HIGH_BOUND - 1) + " inclusive!")
    public int getColumnIndex() {
        return columnIndex;
    }

    public LiveCellCoordinatesBindingModel setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
        return this;
    }
}
