package me.pedrokaua.dslist.controllers;

import me.pedrokaua.dslist.dto.GameDTO;
import me.pedrokaua.dslist.dto.GameMinDTO;
import me.pedrokaua.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games") //classe controladora e adiciona um um padrão de requisição
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) { //O valor passado sera o valor do caminho @GetMapping
        return gameService.findById(id);
    }

    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }
}
