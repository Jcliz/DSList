package com.jcliz.github.dslist.services;


import com.jcliz.github.dslist.dto.GameMinDTO;
import com.jcliz.github.dslist.entities.Game;
import com.jcliz.github.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired //repository injetado/instanciado no service
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        //tabela de games se torna uma lista
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}