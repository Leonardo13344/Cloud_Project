package com.distribuida.rep;

import com.distribuida.db.Medico;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MedicoRepository implements PanacheRepositoryBase<Medico, Integer> {
}
