package org.marcos.discoveryservice2.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BookRating {

    @Id
    @GeneratedValue
    private int id;
    private int bookId;
    private int userId;
    private int rating;

    public BookRating() {
    }

    public BookRating(int id, int bookId, int userId, int rating) {
        super();
        this.id = id;
        this.bookId = bookId;
        this.userId = userId;
        this.rating = rating;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
		this.id = id;
    }
}
