package com.distribuida.rest;





import com.distribuida.db.Indumentaria;
import com.distribuida.rep.IndumentariaRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/indumentaria")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class IndumentariaRest {

    @Inject
    IndumentariaRepository rep;

    @GET
    public List<Indumentaria> findAll(){
        return rep.findAll().list();
    }

    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") Long id){
        var obj = rep.findByIdOptional(Math.toIntExact(id));
        if(obj.isEmpty()){
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(obj.get()).build();
    }

    @POST
    public Response create(Indumentaria entity){
        rep.persist(entity);
        return Response.status(Response.Status.CREATED.getStatusCode(), "Consulta Created").build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Indumentaria obj){
        Indumentaria tmp = rep.findById(Math.toIntExact(id));
        tmp.setArea_indu(obj.getArea_indu());
        tmp.setConcepto_indu(obj.getConcepto_indu());
        tmp.setUbicacion_indu(obj.getUbicacion_indu());
        tmp.setId_laboratorio_indu(obj.getId_laboratorio_indu());
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        rep.deleteById(Math.toIntExact(id));
    }
}
