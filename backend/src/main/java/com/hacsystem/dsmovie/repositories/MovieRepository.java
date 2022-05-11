package com.hacsystem.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hacsystem.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {	
	

}
