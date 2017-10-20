package com.practice.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.domain.Author;

/**
 * @author Anand
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Long>{

}
