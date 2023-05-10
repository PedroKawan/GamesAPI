package me.pedrokaua.dslist.services;

import me.pedrokaua.dslist.dto.GameDTO;
import me.pedrokaua.dslist.entities.Game;
import me.pedrokaua.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll(){
        List<Game> gamesList = gameRepository.findAll();
        List<GameDTO> gamesDTOList = gamesList.stream()
                .map(g -> new GameDTO(g)).toList();

        return gamesDTOList;
    }
}
