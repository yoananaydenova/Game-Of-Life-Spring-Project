package com.yoanan.gameoflifespring.model.binding;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yoanan.gameoflifespring.utils.InputValuesModel;
import com.yoanan.gameoflifespring.utils.ValidationMessages;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


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

    @Min(value =  InputValuesModel.LOW_BOUND, message = ValidationMessages.LOW_BOUND_NUMBER_ROWS)
    @Max(value = InputValuesModel.HIGH_BOUND, message = ValidationMessages.HIGH_BOUND_NUMBER_ROWS)
    public int getNumberOfRows() {
        return numberOfRows;
    }

    public FieldDimensionsBindingModel setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
        return this;
    }

    @Min(value = InputValuesModel.LOW_BOUND, message = ValidationMessages.LOW_BOUND_NUMBER_COLUMNS)
    @Max(value = InputValuesModel.HIGH_BOUND, message = ValidationMessages.HIGH_BOUND_NUMBER_COLUMNS)
    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    public FieldDimensionsBindingModel setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
        return this;
    }
}
