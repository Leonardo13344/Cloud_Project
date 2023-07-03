package com.distribuida.rep;

import com.distribuida.db.Proveedor;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProveedorRepository implements PanacheRepositoryBase<Proveedor, Integer> {
}
