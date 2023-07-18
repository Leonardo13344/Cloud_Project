package com.distribuida.rest;





import com.distribuida.db.Medicina;
import com.distribuida.rep.MedicinaRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/medicinas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class MedicinaRest {

    @Inject
    MedicinaRepository rep;

    @GET
    public List<Medicina> findAll(){
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
    public Response create(Medicina entity){
        rep.persist(entity);
        return Response.status(Response.Status.CREATED.getStatusCode(), "Consulta Created").build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Medicina obj){
        Medicina tmp = rep.findById(Math.toIntExact(id));
        tmp.setCantidad_medi(obj.getCantidad_medi());
        tmp.setComponentes_medi(obj.getComponentes_medi());
        tmp.setDisponibilidad_medi(obj.getDisponibilidad_medi());
        tmp.setId_receta_medi(obj.getId_receta_medi());
        tmp.setId_proveedor_medi(obj.getId_proveedor_medi());
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        rep.deleteById(Math.toIntExact(id));
    }
}
