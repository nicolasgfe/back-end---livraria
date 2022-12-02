package br.edu.unisep.labrary.domain.repository;

import br.edu.unisep.labrary.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}