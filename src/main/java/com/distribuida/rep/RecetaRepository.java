package com.distribuida.rep;

import com.distribuida.db.Receta;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RecetaRepository implements PanacheRepositoryBase<Receta, Integer> {
}
