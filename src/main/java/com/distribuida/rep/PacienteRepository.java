package com.distribuida.rep;

import com.distribuida.db.Paciente;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PacienteRepository implements PanacheRepositoryBase<Paciente, Integer> {
}
