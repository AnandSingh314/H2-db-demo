/**
 * 
 */
package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.domain.Post;
import com.practice.service.PostService;

/**
 * @author Anand
 *
 */
@RestController
public class HomeController {

	private PostService postService;

	/**
	 * @param postService
	 */
	@Autowired
	public HomeController(PostService postService) {
		this.postService = postService;
	}

	@RequestMapping("/latestPost")
	@ResponseBody
	public Post latestPost() {
		return this.postService.getLatestPost();
	}

	@RequestMapping("/posts")
	@ResponseBody
	public List<Post> allPosts() {
		return this.postService.list();
	}

}
