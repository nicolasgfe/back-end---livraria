package br.edu.unisep.labrary.domain.usecase.impl;

import br.edu.unisep.labrary.domain.builden.BookBuilder;
import br.edu.unisep.labrary.domain.dto.BookDto;
import br.edu.unisep.labrary.domain.usecase.FindAllBookUseCase;
import br.edu.unisep.labrary.domain.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class FindAllBookUseCaseImpl implements FindAllBookUseCase {

    private final BookRepository repository;

    private final BookBuilder bookBuilder;

    public List<BookDto> execute(){
        var result = repository.findAll();
        return bookBuilder.build(result);
    }
}
