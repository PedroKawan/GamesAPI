package me.pedrokaua.dslist.services;

import me.pedrokaua.dslist.dto.GameDTO;
import me.pedrokaua.dslist.dto.GameMinDTO;
import me.pedrokaua.dslist.entities.Game;
import me.pedrokaua.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        //Feito a mão antes de ver o metodo Hahaha!
        /*List<Game> gamesList = gameRepository.findAll();
        Game game = gamesList.stream().filter(g -> g.getId() == id).findFirst().get();
        return new GameDTO(game);*/

        //Praticidade do Framework
        Game game = gameRepository.findById(id).get();
        return new GameDTO(game);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> gamesList = gameRepository.findAll();
        List<GameMinDTO> gamesDTOList = gamesList.stream()
                .map(g -> new GameMinDTO(g)).toList();

        return gamesDTOList;
    }
}
