package com.distribuida.rep;

import com.distribuida.db.Factura;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FacturaRepository implements PanacheRepositoryBase<Factura, Integer> {
}
