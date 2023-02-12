package org.marcos.discoveryservice2.Controller;

import java.util.List;

import org.marcos.discoveryservice2.Model.BookRating;
import org.marcos.discoveryservice2.Repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/ratings")
public class RatingsController {
    
	@Autowired
	RatingRepository ratingRepository;
	
	@RequestMapping("/")
	public List<BookRating> getAllRatings(){
		
		return ratingRepository.findAll();
	}
	@PostMapping("/")
	public BookRating postRating(@RequestBody BookRating rating){
		
		ratingRepository.save(rating);
		return rating;
	}
	@PutMapping("/{id}")
	public BookRating updateRating(@PathVariable int id, @RequestBody BookRating rating){
		
		ratingRepository.save(rating);
		
		return rating;
	}
	@DeleteMapping("/{id}")
	public String deleteRating(@PathVariable int id){
		
		ratingRepository.deleteById(id);
		return "Elemento eliminado con exito";
	}
}
