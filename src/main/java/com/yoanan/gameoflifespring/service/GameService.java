package com.yoanan.gameoflifespring.service;

import com.yoanan.gameoflifespring.model.binding.GameBindingModel;
import com.yoanan.gameoflifespring.model.service.GameServiceModel;
import org.springframework.stereotype.Service;


public interface GameService {
    GameServiceModel createNextGeneration(GameBindingModel gameBindingModel);
}
