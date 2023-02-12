package org.marcos.discoveryservice2.Repository;

import org.marcos.discoveryservice2.Model.BookRating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<BookRating, Integer> {
    
}
