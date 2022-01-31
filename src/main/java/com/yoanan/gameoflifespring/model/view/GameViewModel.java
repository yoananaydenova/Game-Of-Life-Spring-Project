package com.yoanan.gameoflifespring.model.view;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GameViewModel {
    @JsonProperty("field_dimensions")
    private FieldDimensionsViewModel fieldDimensions;
    @JsonProperty("live_cells")
    private List<LiveCellCoordinatesViewModel> liveCells;

    public GameViewModel() {
    }

    public GameViewModel(FieldDimensionsViewModel fieldDimensions, List<LiveCellCoordinatesViewModel> liveCells) {
        this.fieldDimensions = fieldDimensions;
        this.liveCells = liveCells;
    }

    public FieldDimensionsViewModel getFieldDimensions() {
        return fieldDimensions;
    }

    public GameViewModel setFieldDimensions(FieldDimensionsViewModel fieldDimensions) {
        this.fieldDimensions = fieldDimensions;
        return this;
    }

    public List<LiveCellCoordinatesViewModel> getLiveCells() {
        return liveCells;
    }

    public GameViewModel setLiveCells(List<LiveCellCoordinatesViewModel> liveCells) {
        this.liveCells = liveCells;
        return this;
    }
}
