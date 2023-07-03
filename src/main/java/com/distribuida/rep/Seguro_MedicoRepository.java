package com.distribuida.rep;

import com.distribuida.db.Seguro_Medico;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Seguro_MedicoRepository implements PanacheRepositoryBase<Seguro_Medico, Integer> {
}
