package com.distribuida.rep;

import com.distribuida.db.Historial;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HistorialRepository implements PanacheRepositoryBase<Historial, Integer> {
}
