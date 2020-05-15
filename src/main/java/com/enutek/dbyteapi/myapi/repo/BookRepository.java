package com.enutek.dbyteapi.myapi.repo;

import com.enutek.dbyteapi.myapi.persistence.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByTitle(String title);
}
