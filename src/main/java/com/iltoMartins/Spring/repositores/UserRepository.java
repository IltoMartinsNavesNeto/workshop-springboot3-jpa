package com.iltoMartins.Spring.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iltoMartins.Spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
