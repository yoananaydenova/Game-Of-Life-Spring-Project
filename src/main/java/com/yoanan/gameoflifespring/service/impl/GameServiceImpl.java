package com.yoanan.gameoflifespring.service.impl;

import com.yoanan.gameoflifespring.model.binding.GameBindingModel;
import com.yoanan.gameoflifespring.model.service.GameServiceModel;
import com.yoanan.gameoflifespring.service.GameService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {
    private final ModelMapper modelMapper;

    public GameServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public GameServiceModel createNextGeneration(GameBindingModel gameBindingModel) {
        return null;
    }
}
