package br.edu.unisep.labrary.domain.builden;

import br.edu.unisep.labrary.domain.dto.BookDto;
import br.edu.unisep.labrary.domain.dto.CreateBookDto;
import br.edu.unisep.labrary.domain.entity.Book;

import java.util.List;


public interface BookBuilder {
    Book build(CreateBookDto dta);
    BookDto build(Book book);
    List<BookDto> build(List<Book> book);
}
