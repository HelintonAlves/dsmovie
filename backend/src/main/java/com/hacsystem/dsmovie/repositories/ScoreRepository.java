package com.hacsystem.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hacsystem.dsmovie.entities.Score;
import com.hacsystem.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {	

}
