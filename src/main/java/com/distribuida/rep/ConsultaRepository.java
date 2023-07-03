package com.distribuida.rep;

import com.distribuida.db.Consulta;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ConsultaRepository implements PanacheRepositoryBase<Consulta, Integer> {
}
