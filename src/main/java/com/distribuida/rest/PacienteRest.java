package com.distribuida.rest;






import com.distribuida.db.Paciente;
import com.distribuida.rep.PacienteRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/pacientes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class PacienteRest {

    @Inject
    PacienteRepository rep;

    @GET
    public List<Paciente> findAll(){
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
    public Response create(Paciente entity){
        rep.persist(entity);
        return Response.status(Response.Status.CREATED.getStatusCode(), "Consulta Created").build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Paciente obj){
        Paciente tmp = rep.findById(Math.toIntExact(id));
        tmp.setApellido_materno_pac(obj.getApellido_materno_pac());
        tmp.setCedula_pac(obj.getCedula_pac());
        tmp.setDomicilio_pac(obj.getDomicilio_pac());
        tmp.setFecha_nac_pac(obj.getFecha_nac_pac());
        tmp.setApellido_paterno_pac(obj.getApellido_paterno_pac());
        tmp.setId_hospitalario_pac(obj.getId_hospitalario_pac());
        tmp.setNum_expediente_pac(obj.getNum_expediente_pac());
        tmp.setNombre_pac(obj.getNombre_pac());
        tmp.setSexo_pac(obj.getSexo_pac());
        tmp.setTelefono_pac(obj.getTelefono_pac());
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        rep.deleteById(Math.toIntExact(id));
    }
}
