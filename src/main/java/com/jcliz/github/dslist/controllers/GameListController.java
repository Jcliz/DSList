package com.jcliz.github.dslist.controllers;

import com.jcliz.github.dslist.dto.GameDTO;
import com.jcliz.github.dslist.dto.GameListDTO;
import com.jcliz.github.dslist.dto.GameMinDTO;
import com.jcliz.github.dslist.services.GameListService;
import com.jcliz.github.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
