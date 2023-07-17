package com.distribuida.service;

import com.distribuida.rep.GenericRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;

import java.util.List;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class CrudServices<T> {

    @Inject
    GenericRepository<T> rep;

    @GET
    List<T> findAll(){
        return rep.findAll().list();
    }

    @GET
    @Path("/{id}")
    Response getById(@PathParam("id") Long id){
        var obj = rep.findByIdOptional(Math.toIntExact(id));
        if(obj.isEmpty()){
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(obj.get()).build();
    }

    @POST
    Response create(T entity){
        rep.persist(entity);
        return Response.status(Response.Status.CREATED.getStatusCode(), "Consulta Created").build();
    }

    @DELETE
    @Path("/{id}")
    void delete(@PathParam("id") Long id){
        rep.deleteById(Math.toIntExact(id));
    }
}
