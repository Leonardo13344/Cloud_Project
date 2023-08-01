package com.distribuida.rest;

import com.distribuida.db.Consulta;
import com.distribuida.rep.ConsultaRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import java.util.List;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/consultas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class ConsultaRest {

    @Inject
    ConsultaRepository rep;

    @GET
    public List<Consulta> findAll(){
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
    public Response create(Consulta entity){
        rep.persist(entity);
        return Response.status(Response.Status.CREATED.getStatusCode(), "Consulta Created").build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Consulta obj){
        Consulta tmp = rep.findById(Math.toIntExact(id));
        tmp.setConcepto_cons(obj.getConcepto_cons());
        tmp.setFecha_cons(obj.getFecha_cons());
        tmp.setId_medico_cons(obj.getId_medico_cons());
        tmp.setId_paciente_cons(obj.getId_paciente_cons());
        tmp.setEstado_cons(obj.getEstado_cons());
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        rep.deleteById(Math.toIntExact(id));
    }
}
