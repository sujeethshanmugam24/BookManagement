package com.example.Bookapplication.Repository;

import com.example.Bookapplication.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
    public Book findBookByTitle(String title);
}
