package com.distribuida.rep;

import com.distribuida.db.Book;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;


import java.util.Optional;

@ApplicationScoped
public class BookRepository implements PanacheRepositoryBase<Book, Long> {

}
