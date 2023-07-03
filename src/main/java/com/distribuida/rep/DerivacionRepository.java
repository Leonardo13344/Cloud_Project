package com.distribuida.rep;

import com.distribuida.db.Derivacion;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DerivacionRepository implements PanacheRepositoryBase<Derivacion, Integer> {
}
