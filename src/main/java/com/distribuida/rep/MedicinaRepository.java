package com.distribuida.rep;

import com.distribuida.db.Medicina;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MedicinaRepository implements PanacheRepositoryBase<Medicina, Integer> {
}
