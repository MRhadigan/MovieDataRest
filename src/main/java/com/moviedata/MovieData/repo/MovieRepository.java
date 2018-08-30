package com.moviedata.MovieData.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviedata.MovieData.entity.Movies;



public interface MovieRepository extends JpaRepository<Movies, String> {
	
	List<Movies> findByTitle(String title);

	List<Movies> findByCategory(String category);
	
}
