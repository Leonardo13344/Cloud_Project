package com.distribuida.rep;

import com.distribuida.db.Indumentaria;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class IndumentariaRepository implements PanacheRepositoryBase<Indumentaria, Integer> {
}
