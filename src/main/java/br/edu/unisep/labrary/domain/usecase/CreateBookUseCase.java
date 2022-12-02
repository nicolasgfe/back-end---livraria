package br.edu.unisep.labrary.domain.usecase;

import br.edu.unisep.labrary.domain.dto.CreateBookDto;

public interface CreateBookUseCase {
    void execute(CreateBookDto bookData);
}
