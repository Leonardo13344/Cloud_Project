package com.distribuida.rest;






import com.distribuida.db.Laboratorio;
import com.distribuida.rep.LaboratorioRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/laboratorios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class LaboratorioRest {

    @Inject
    LaboratorioRepository rep;

    @GET
    public List<Laboratorio> findAll(){
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
    public Response create(Laboratorio entity){
        rep.persist(entity);
        return Response.status(Response.Status.CREATED.getStatusCode(), "Consulta Created").build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Laboratorio obj){
        Laboratorio tmp = rep.findById(Math.toIntExact(id));
        tmp.setFecha_labo(obj.getFecha_labo());
        tmp.setId_personal_labo(obj.getId_personal_labo());
        tmp.setObservaciones_labo(obj.getObservaciones_labo());
        tmp.setNombre_pac_labo(obj.getNombre_pac_labo());
        tmp.setMed_solicitante_labo(obj.getMed_solicitante_labo());
        tmp.setTipo_prueba_labo(obj.getTipo_prueba_labo());
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        rep.deleteById(Math.toIntExact(id));
    }
}
