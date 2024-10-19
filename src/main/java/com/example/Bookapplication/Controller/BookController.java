package com.example.Bookapplication.Controller;


import com.example.Bookapplication.Entity.Book;
import com.example.Bookapplication.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class BookController{

    private final BookService bookservice;
    @Autowired
    public BookController(BookService bookservice){
        this.bookservice=bookservice;
    }

    @RequestMapping("/")
    public String home(){
        return "index1";
    }

    @PostMapping("/addbook")
    public ModelAndView addBook(@RequestParam("bookName") String bookName,
                                        @RequestParam("author") String author,
                                        @RequestParam("genre") String genre, ModelAndView model){
        Book book =bookservice.addBook(new Book(bookName,author,genre));
        model.setViewName("result");
        model.addObject("bookName", book.getTitle());
        model.addObject("author", book.getAuthor());
        model.addObject("genre", book.getGenre());
        return model;
    }

    @GetMapping("/getBook/{bookName}")
    public ResponseEntity<Book> getBookByName(@PathVariable("bookName") String name){
        Book bookByName=bookservice.getBookByName(name);
        return ResponseEntity.ok(bookByName);
    }
    @GetMapping("/getAllBooks")
    public ResponseEntity<List<Book>> getAllUsers() {
        List<Book> books = bookservice.getAllBooks();
        return ResponseEntity.ok(books);  // 200 OK with the list of users as body
    }


    @PutMapping("/updatebook")
    public ResponseEntity<Book> updateBook(@RequestBody  Book book){
        Book updatebook =bookservice.updateBook(book);
        return ResponseEntity.ok(updatebook);
    }

    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable("id") Integer id){
        bookservice.deleteBook(id);
        return ResponseEntity.ok().build();
    }

}
