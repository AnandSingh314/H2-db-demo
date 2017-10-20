/**
 * 
 */
package com.practice.service;

import com.practice.repository.AuthorRepository;

/**
 * @author Anand
 *
 */
public class AuthorService {

	private AuthorRepository authorRepository;

	public AuthorService(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

}
