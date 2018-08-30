package com.moviedata.MovieData.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "movie_data")
public class Movies {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private long id;
	private String title;
	private String category;
	
	
	public Movies() {
		
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "id=" + id + ", title=" + title + ", category=" + category;
	}
	
	
	
	
	
}
