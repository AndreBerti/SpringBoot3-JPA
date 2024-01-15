package com.tekila.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tekila.course.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
