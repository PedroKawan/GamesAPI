package me.pedrokaua.dslist.services;

import me.pedrokaua.dslist.dto.GameListDTO;
import me.pedrokaua.dslist.entities.GameList;
import me.pedrokaua.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> lists = gameListRepository.findAll();
        List<GameListDTO> listsDTO = lists.stream().map(l -> new GameListDTO(l)).toList();
        return listsDTO;
    }
}
