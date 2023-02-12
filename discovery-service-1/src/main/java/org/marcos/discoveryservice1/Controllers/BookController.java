package org.marcos.discoveryservice1.Controllers;

import java.util.List;
import java.util.Optional;

import org.marcos.discoveryservice1.Model.Book;
import org.marcos.discoveryservice1.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {
    
    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/")
	public List<Book> getAllBooks(){
		
		List<Book> books = bookRepository.findAll();
		return books;
	}
	@RequestMapping("/{bookId}")
	public Optional<Book> getBook(@PathVariable int bookId){
		
		
		return bookRepository.findById(bookId);
	}
	@PostMapping("/insert")
	public Book postBook(Book book){	
		
		bookRepository.save(book);
		return book;
	}
	@PutMapping("/update/{bookId}")
	public Book updateBook(@PathVariable int bookId, @RequestBody Book book){
		
		bookRepository.save(book);
		return book;
		
	}
	@RequestMapping( method=RequestMethod.DELETE, value="/delete/{bookId}")
	public String deleteBook(@PathVariable int bookId){
		
		bookRepository.deleteById(bookId);
		
		return "Elemento borrado con exito";
	}
}
