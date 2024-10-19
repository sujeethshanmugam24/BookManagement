package com.example.Bookapplication.Service;


import com.example.Bookapplication.Entity.Book;
import com.example.Bookapplication.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    public Book getBookByName(String name){
        return bookRepository.findBookByTitle(name);
    }

    public Book updateBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteBook(Integer id){
        bookRepository.deleteById(id);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
