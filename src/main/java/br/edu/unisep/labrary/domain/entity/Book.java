package br.edu.unisep.labrary.domain.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private Integer id;

    @Column(name = "ds_title")
    private String title;

    @Column(name = "nm_author")
    private String author;

    @Column(name = "nr_edicao")
    private Integer edicao;

    @Column(name = "nr_pages")
    private Integer pages;

    @Column(name = "ds_summary")
    private String summary;

}
