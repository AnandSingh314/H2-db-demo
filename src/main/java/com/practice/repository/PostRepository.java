/**
 * 
 */
package com.practice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.practice.domain.Post;

/**
 * @author Anand
 *
 */
public interface PostRepository extends CrudRepository<Post, Long> {

	// find the lates post
	Post findFirstByOrderByPostedOnDesc();

	List<Post> findAllByOrderByPostedOnDesc();
	
}
