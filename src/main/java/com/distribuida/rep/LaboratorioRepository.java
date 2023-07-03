package com.distribuida.rep;

import com.distribuida.db.Laboratorio;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LaboratorioRepository implements PanacheRepositoryBase<Laboratorio, Integer> {
}
