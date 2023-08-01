package com.distribuida.rest;






import com.distribuida.db.Personal;
import com.distribuida.rep.PersonalRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/personal")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class PersonalRest {

    @Inject
    PersonalRepository rep;

    @GET
    public List<Personal> findAll(){
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
    public Response create(Personal entity){
        rep.persist(entity);
        return Response.status(Response.Status.CREATED.getStatusCode(), "Consulta Created").build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Personal obj){
        Personal tmp = rep.findById(Math.toIntExact(id));
        tmp.setEncargado_pers(obj.getEncargado_pers());
        tmp.setHorario_pers(obj.getHorario_pers());
        tmp.setId_departamento_pers(obj.getId_departamento_pers());
        tmp.setEstado_pers(obj.getEstado_pers());
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        rep.deleteById(Math.toIntExact(id));
    }
}
