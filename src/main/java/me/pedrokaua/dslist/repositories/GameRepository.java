package me.pedrokaua.dslist.repositories;

import me.pedrokaua.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
