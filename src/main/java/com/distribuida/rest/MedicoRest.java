package com.distribuida.rest;






import com.distribuida.db.Medico;
import com.distribuida.rep.MedicoRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/medicos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class MedicoRest {

    @Inject
    MedicoRepository rep;

    @GET
    public List<Medico> findAll(){
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
    public Response create(Medico entity){
        rep.persist(entity);
        return Response.status(Response.Status.CREATED.getStatusCode(), "Consulta Created").build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Medico obj){
        Medico tmp = rep.findById(Math.toIntExact(id));
        tmp.setApellidos_medi(obj.getApellidos_medi());
        tmp.setCorreo_medi(obj.getCorreo_medi());
        tmp.setDireccion_medi(obj.getDireccion_medi());
        tmp.setHospital_medi(obj.getHospital_medi());
        tmp.setId_especialidad_medi(obj.getId_especialidad_medi());
        tmp.setNombre_medi(obj.getNombre_medi());
        tmp.setSalario_medi(obj.getSalario_medi());
        tmp.setSupervisor_id_medi(obj.getSupervisor_id_medi());
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        rep.deleteById(Math.toIntExact(id));
    }
}
