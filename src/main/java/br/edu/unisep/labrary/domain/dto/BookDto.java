package br.edu.unisep.labrary.domain.dto;

import lombok.Data;

@Data
public class BookDto {
    private Integer Id;

    private String title;
    private String author;

    private Integer edicao;
    private Integer pages;

    private String summary;
}
