package com.jcliz.github.dslist.repositories;

import com.jcliz.github.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}