package org.marcos.discoveryservice1.Repository;

import org.marcos.discoveryservice1.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
    
}
