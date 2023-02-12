package org.marcos.discoveryserviceprincipal.Controller;

import java.util.List;

import org.marcos.discoveryserviceprincipal.Models.Book;
import org.marcos.discoveryserviceprincipal.Services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
	RestTemplate restTemplate;
	@Autowired
	MainService mainService;

	@RequestMapping("/movies")
	public List<Book> test() {

				var movies = mainService.getAllBooks();
					return movies;

	}

    @RequestMapping("/ratings")
	public List<Object> test1() {

        ResponseEntity<List<Object> > ratings_body = restTemplate.exchange("http://service-rating/api/ratings/", 
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Object>>() {});
				List<Object> ratings =  ratings_body.getBody();  

                return ratings;
    }

}
