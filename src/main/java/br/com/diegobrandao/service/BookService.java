package br.com.diegobrandao.service;

import br.com.diegobrandao.exception.BookNotFoundException;
import br.com.diegobrandao.model.Book;

import java.util.List;

public interface BookService {

    List<Book> findAllBooks();

    Book findBookById(Long id) throws BookNotFoundException;

    Book saveBook(Book book);

    void updateBook(Book book);

    void deleteBook(Long id);
}
