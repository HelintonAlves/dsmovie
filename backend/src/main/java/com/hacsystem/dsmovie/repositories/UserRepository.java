package com.hacsystem.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hacsystem.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
