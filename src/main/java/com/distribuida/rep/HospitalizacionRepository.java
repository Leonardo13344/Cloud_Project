package com.distribuida.rep;

import com.distribuida.db.Hospitalizacion;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HospitalizacionRepository implements PanacheRepositoryBase<Hospitalizacion, Integer> {
}
