package com.distribuida.rep;

import com.distribuida.db.SeguroMedico;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SeguroMedicoRepository implements PanacheRepositoryBase<SeguroMedico, Integer> {
}
