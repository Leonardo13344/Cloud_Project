package com.distribuida.rep;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GenericRepository<T> implements PanacheRepositoryBase<T, Integer> {
}
