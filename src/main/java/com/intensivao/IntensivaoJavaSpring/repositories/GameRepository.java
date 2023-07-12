package com.intensivao.IntensivaoJavaSpring.repositories;

import com.intensivao.IntensivaoJavaSpring.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
