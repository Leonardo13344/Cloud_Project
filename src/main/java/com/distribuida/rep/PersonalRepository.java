package com.distribuida.rep;

import com.distribuida.db.Personal;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonalRepository implements PanacheRepositoryBase<Personal, Integer> {
}
