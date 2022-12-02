package br.edu.unisep.labrary.domain.builden.impl;

import br.edu.unisep.labrary.domain.builden.BookBuilder;
import br.edu.unisep.labrary.domain.dto.BookDto;
import br.edu.unisep.labrary.domain.dto.CreateBookDto;
import br.edu.unisep.labrary.domain.entity.Book;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookBuilderImpl implements BookBuilder {


    public Book build(CreateBookDto bookData) {
        var book = new Book();
        book.setTitle(bookData .getTitle());
        book.setAuthor(bookData.getAuthor());
        book.setEdicao(bookData.getEdicao());
        book.setPages(bookData.getPages());
        book.setSummary(bookData.getSummary());

        return book;
    }

    public BookDto build(Book book) {
        var dto = new BookDto();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setAuthor(book.getAuthor());
        dto.setEdicao(book.getEdicao());
        dto.setPages(book.getPages());
        dto.setSummary(book.getSummary());

        return dto;
    }

    public List<BookDto> build(List<Book> books) {
        return books.stream().map(this::build).toList();
    }
}
