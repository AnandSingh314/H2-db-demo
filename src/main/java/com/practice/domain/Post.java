/**
 * 
 */
package com.practice.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author Anand
 *
 */
@Entity
public class Post {

	@Id
	@GeneratedValue
	private Long id;
	private String title;
	@Column(columnDefinition="TEXT")
	private String body;
	private Date postedOn;

	// Author
	@ManyToOne
	@JsonManagedReference
	private Author author;	

	public Post() {
	}

	/**
	 * @param title
	 * @param body
	 */
	public Post(String title, String body) {
		this.title = title;
		this.body = body;
	}



	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}



	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}



	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}



	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}



	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}



	/**
	 * @return the postedOn
	 */
	public Date getPostedOn() {
		return postedOn;
	}



	/**
	 * @param postedOn the postedOn to set
	 */
	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}



	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}



	/**
	 * @param author the author to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Post: [id="+this.id+", title="+this.title+", body="+this.body+"]";
	}
}
