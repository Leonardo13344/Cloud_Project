package com.distribuida.rep;

import com.distribuida.db.Departamento;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DepartamentoRepository implements PanacheRepositoryBase<Departamento, Integer> {
}
