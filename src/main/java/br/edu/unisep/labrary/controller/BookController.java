package br.edu.unisep.labrary.controller;

import br.edu.unisep.labrary.domain.dto.BookDto;
import br.edu.unisep.labrary.domain.dto.CreateBookDto;
import br.edu.unisep.labrary.domain.usecase.CreateBookUseCase;
import br.edu.unisep.labrary.domain.usecase.FindAllBookUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final FindAllBookUseCase findAllBookUseCase;
    private final CreateBookUseCase createBookUseCase;



    @PostMapping
    public ResponseEntity save(@RequestBody CreateBookDto bookData){
        createBookUseCase.execute(bookData);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<BookDto>> findAll(){
        var result = findAllBookUseCase.execute();
        if(result.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(result);
    }

}
