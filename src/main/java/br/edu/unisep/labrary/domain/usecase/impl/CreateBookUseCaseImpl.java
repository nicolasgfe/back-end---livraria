package br.edu.unisep.labrary.domain.usecase.impl;

import br.edu.unisep.labrary.domain.builden.BookBuilder;
import br.edu.unisep.labrary.domain.usecase.CreateBookUseCase;
import br.edu.unisep.labrary.domain.entity.Book;
import br.edu.unisep.labrary.domain.repository.BookRepository;
import br.edu.unisep.labrary.domain.dto.CreateBookDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateBookUseCaseImpl implements CreateBookUseCase {

    private final BookRepository repository;

    private final BookBuilder bookBuilder;

    public void execute(CreateBookDto bookData){
        var book = bookBuilder.build(bookData);

        repository.save(book);
    }

}
