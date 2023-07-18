package com.distribuida.rest;




import com.distribuida.db.Especialidad;
import com.distribuida.rep.EspecialidadRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/especialidades")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class EspecialidadRest {

    @Inject
    EspecialidadRepository rep;

    @GET
    public List<Especialidad> findAll(){
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
    public Response create(Especialidad entity){
        rep.persist(entity);
        return Response.status(Response.Status.CREATED.getStatusCode(), "Consulta Created").build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Especialidad obj){
        Especialidad tmp = rep.findById(Math.toIntExact(id));
        tmp.setDescripcion_espe(obj.getDescripcion_espe());
        tmp.setEncargado_espe(obj.getEncargado_espe());
        tmp.setId_departamento_espe(obj.getId_departamento_espe());
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        rep.deleteById(Math.toIntExact(id));
    }
}
