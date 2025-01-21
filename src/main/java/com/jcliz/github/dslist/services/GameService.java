package com.jcliz.github.dslist.services;


import com.jcliz.github.dslist.dto.GameDTO;
import com.jcliz.github.dslist.dto.GameMinDTO;
import com.jcliz.github.dslist.entities.Game;
import com.jcliz.github.dslist.projections.GameMinProjection;
import com.jcliz.github.dslist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired //repository injetado/instanciado no service
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);

    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        //tabela de games se torna uma lista
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findBylist(Long listId) {
        //tabela de games se torna uma lista
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}