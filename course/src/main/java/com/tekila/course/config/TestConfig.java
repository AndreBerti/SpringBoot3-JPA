package com.tekila.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.tekila.course.entity.User;
import com.tekila.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1= new User(null,"Maria","maria@gmail.com","987654321","1234");
		User u2= new User(null, "Tekila","tekila@gmail.com","963852741","987654321");
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
}
