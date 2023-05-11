package me.pedrokaua.dslist.repositories;

import me.pedrokaua.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
