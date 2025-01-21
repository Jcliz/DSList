package com.jcliz.github.dslist.repositories;

import com.jcliz.github.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}