package org.marcos.discoveryserviceprincipal.Services;

import java.util.Arrays;
import java.util.List;

import org.marcos.discoveryserviceprincipal.Models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;



@Service
public class MainService {

    @Autowired
	RestTemplate restTemplate;
    
    @HystrixCommand(fallbackMethod = "defaultBook")
    public List<Book> getAllBooks() {

				
		ResponseEntity<List<Book> > book_body = restTemplate.exchange("http://services-books/api/books/",
            HttpMethod.GET, null, new ParameterizedTypeReference<List<Book>>() {});
        List<Book> books =  book_body.getBody();     
        return books;
	}

    private List<Book>  defaultBook() {
        return Arrays.asList(new Book(4, "Libro suplente", "suplente"));
    }
}
