package com.intensivao.IntensivaoJavaSpring.repositories;

import com.intensivao.IntensivaoJavaSpring.entities.Game;
import com.intensivao.IntensivaoJavaSpring.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
