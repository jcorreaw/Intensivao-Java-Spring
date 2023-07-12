package com.intensivao.IntensivaoJavaSpring.services;

import com.intensivao.IntensivaoJavaSpring.dto.GameMinDTO;
import com.intensivao.IntensivaoJavaSpring.entities.Game;
import com.intensivao.IntensivaoJavaSpring.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}

