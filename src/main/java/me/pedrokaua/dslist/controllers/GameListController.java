package me.pedrokaua.dslist.controllers;

import me.pedrokaua.dslist.dto.GameDTO;
import me.pedrokaua.dslist.dto.GameListDTO;
import me.pedrokaua.dslist.dto.GameMinDTO;
import me.pedrokaua.dslist.services.GameListService;
import me.pedrokaua.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists") //classe controladora e adiciona um um padrão de requisição
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }
}
