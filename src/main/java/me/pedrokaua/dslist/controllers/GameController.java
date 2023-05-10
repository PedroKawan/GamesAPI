package me.pedrokaua.dslist.controllers;

import me.pedrokaua.dslist.dto.GameDTO;
import me.pedrokaua.dslist.entities.Game;
import me.pedrokaua.dslist.repositories.GameRepository;
import me.pedrokaua.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameDTO> findAll() {
        List<GameDTO> gamesList = gameService.findAll();
        return gamesList;
    }
}
