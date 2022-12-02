package br.edu.unisep.labrary.domain.usecase;

import br.edu.unisep.labrary.domain.dto.BookDto;

import java.util.List;

public interface FindAllBookUseCase {
    List<BookDto> execute();
}
