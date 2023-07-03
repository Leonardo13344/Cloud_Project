package com.distribuida.rep;

import com.distribuida.db.Especialidad;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EspecialidadRepository implements PanacheRepositoryBase<Especialidad, Integer> {
}
