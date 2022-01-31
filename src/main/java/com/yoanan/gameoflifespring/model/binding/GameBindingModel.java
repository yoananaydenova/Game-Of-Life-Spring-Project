package com.yoanan.gameoflifespring.model.binding;



import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import java.util.List;

public class GameBindingModel {

    @JsonProperty("field_dimensions")
    @Valid
    private FieldDimensionsBindingModel fieldDimensions;
    @JsonProperty("live_cells")
    @Valid
    private List<LiveCellCoordinatesBindingModel> liveCells;

    public GameBindingModel() {
    }

    public GameBindingModel(FieldDimensionsBindingModel fieldDimensions, List<LiveCellCoordinatesBindingModel> liveCells) {
        this.fieldDimensions = fieldDimensions;
        this.liveCells = liveCells;
    }

    public FieldDimensionsBindingModel getFieldDimensions() {
        return fieldDimensions;
    }

    public GameBindingModel setFieldDimensions(FieldDimensionsBindingModel fieldDimensions) {
        this.fieldDimensions = fieldDimensions;
        return this;
    }

    public List<LiveCellCoordinatesBindingModel> getLiveCells() {
        return liveCells;
    }

    public GameBindingModel setLiveCells(List<LiveCellCoordinatesBindingModel> liveCells) {
        this.liveCells = liveCells;
        return this;
    }
}
