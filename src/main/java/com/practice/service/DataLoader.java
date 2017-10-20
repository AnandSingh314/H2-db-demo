/**
 * 
 */
package com.practice.service;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.domain.Author;
import com.practice.domain.Post;
import com.practice.repository.AuthorRepository;
import com.practice.repository.PostRepository;

/**
 * @author Anand
 *
 */
@Service
public class DataLoader {

	private PostRepository postRepository;
	private AuthorRepository authorRepository;
	
	/**
	 * @param postRepository
	 * @param authorRepository
	 */
	@Autowired
	public DataLoader(PostRepository postRepository, AuthorRepository authorRepository) {
		this.postRepository = postRepository;
		this.authorRepository = authorRepository;
	}
	
	@PostConstruct
	private void loadData(){
		Author author = new Author("Anand", "Vijay");
		authorRepository.save(author);
		
		Post post = new Post("Spring Boot is awesome", "Blog post body content....!!");
		post.setPostedOn(new Date());
		post.setAuthor(author);
		
		postRepository.save(post);
		
	}
	
	
}
