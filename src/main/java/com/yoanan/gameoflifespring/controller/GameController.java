package com.yoanan.gameoflifespring.controller;

import com.yoanan.gameoflifespring.model.binding.GameBindingModel;
import com.yoanan.gameoflifespring.model.service.GameServiceModel;
import com.yoanan.gameoflifespring.model.view.FieldDimensionsViewModel;
import com.yoanan.gameoflifespring.model.view.GameViewModel;

import com.yoanan.gameoflifespring.model.view.LiveCellCoordinatesViewModel;
import com.yoanan.gameoflifespring.service.GameService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class GameController {

    private final GameService gameService;
    private final ModelMapper modelMapper;

    public GameController(GameService gameService, ModelMapper modelMapper) {
        this.gameService = gameService;
        this.modelMapper = modelMapper;
    }


    @PostMapping("/game-of-life")
    public ResponseEntity<GameViewModel> play (@Valid @RequestBody GameBindingModel gameBindingModel) {

        GameServiceModel gameServiceModel = gameService.createNextGeneration(gameBindingModel);

        FieldDimensionsViewModel fieldDimensionsViewModel =
                new FieldDimensionsViewModel(gameServiceModel.getNumberOfRows(), gameServiceModel.getNumberOfColumns());

        List<LiveCellCoordinatesViewModel> liveCellCoordinatesViewModel = gameServiceModel
                .getLiveCellCoordinates()
                .stream()
                .map(c -> modelMapper.map(c, LiveCellCoordinatesViewModel.class))
                .collect(Collectors.toList());

        GameViewModel gameViewModel = new GameViewModel(fieldDimensionsViewModel,liveCellCoordinatesViewModel);

        return new ResponseEntity<GameViewModel>(gameViewModel, HttpStatus.OK);

    }
}
