package com.intensivao.IntensivaoJavaSpring.services;

import com.intensivao.IntensivaoJavaSpring.dto.GameDTO;
import com.intensivao.IntensivaoJavaSpring.dto.GameMinDTO;
import com.intensivao.IntensivaoJavaSpring.entities.Game;
import com.intensivao.IntensivaoJavaSpring.projections.GameMinProjection;
import com.intensivao.IntensivaoJavaSpring.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }



}

