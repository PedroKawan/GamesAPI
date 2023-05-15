package me.pedrokaua.dslist.services;

import me.pedrokaua.dslist.dto.GameListDTO;
import me.pedrokaua.dslist.entities.Game;
import me.pedrokaua.dslist.entities.GameList;
import me.pedrokaua.dslist.projections.GameMinProjection;
import me.pedrokaua.dslist.repositories.GameListRepository;
import me.pedrokaua.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> lists = gameListRepository.findAll();
        List<GameListDTO> listsDTO = lists.stream().map(l -> new GameListDTO(l)).toList();
        return listsDTO;
    }
    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection game = list.remove(sourceIndex);
        list.add(destinationIndex, game);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
