package com.yoanan.gameoflifespring.model.binding;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FieldDimensionsBindingModel {

    @JsonProperty("number_rows")
    private int numberOfRows;
    @JsonProperty("number_columns")
    private int numberOfColumns;

    public FieldDimensionsBindingModel() {
    }

    public FieldDimensionsBindingModel(int numberOfRows, int numberOfColumns) {
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public FieldDimensionsBindingModel setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
        return this;
    }

    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    public FieldDimensionsBindingModel setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
        return this;
    }
}
