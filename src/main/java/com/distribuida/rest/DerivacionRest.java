package com.distribuida.rest;



import com.distribuida.db.Derivacion;
import com.distribuida.rep.DerivacionRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/derivaciones")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class DerivacionRest {

    @Inject
    DerivacionRepository rep;

    @GET
    public List<Derivacion> findAll(){
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
    public Response create(Derivacion entity){
        rep.persist(entity);
        return Response.status(Response.Status.CREATED.getStatusCode(), "Consulta Created").build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Derivacion obj){
        Derivacion tmp = rep.findById(Math.toIntExact(id));
        tmp.setDescripcion_deri(obj.getDescripcion_deri());
        tmp.setFecha_deri(obj.getFecha_deri());
        tmp.setId_med_deri(obj.getId_med_deri());
        tmp.setId_usuario_deri(obj.getId_usuario_deri());
        tmp.setEstado_deri(obj.getEstado_deri());
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        rep.deleteById(Math.toIntExact(id));
    }
}
