package com.moviedata.MovieData;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.moviedata.MovieData.entity.Movies;
import com.moviedata.MovieData.repo.MovieRepository;

@RestController
public class HomeController {

	@Autowired
	MovieRepository mrep;
	
	@RequestMapping("/")
	public ModelAndView index() {
		
	return new ModelAndView("index");
	}
	
	@GetMapping("/findbytitle/{title}")
	public List<Movies> findByTitle(@PathVariable("title") String title) {
		return mrep.findByTitle(title);
	}
	
	@GetMapping("/findbycategory/{category}")
	public List<Movies> findByCategory(@PathVariable("category") String category) {
		return mrep.findByCategory(category);
	}
	
	@GetMapping("/movielist")
	public List<Movies> movieList(){
		List<Movies> movieList =  mrep.findAll();
		//List<Movie> movieList =  new ArrayList<>();
		
		return movieList;
	}
	
}
