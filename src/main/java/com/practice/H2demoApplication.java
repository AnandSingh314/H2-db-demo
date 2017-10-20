package com.practice;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.domain.Post;
import com.practice.repository.PostRepository;
import com.practice.service.DataLoader;

@SpringBootApplication
public class H2demoApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(H2demoApplication.class);
	
	@Autowired
	PostRepository postRepository;
	
	@Autowired
	DataLoader dataLoader;
	
	public static void main(String[] args) {
		SpringApplication.run(H2demoApplication.class, args);
	}
	
	
	@PostConstruct
	void seePosts(){
		LOGGER.info("seePosts() method is called");
		for(Post post : postRepository.findAll()){
			LOGGER.info(post.toString());
		}
	}
	
}
