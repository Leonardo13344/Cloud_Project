package com.distribuida.rest;






import com.distribuida.db.Receta;
import com.distribuida.rep.RecetaRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/recetas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class RecetaRest {

    @Inject
    RecetaRepository rep;

    @GET
    public List<Receta> findAll(){
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
    public Response create(Receta entity){
        rep.persist(entity);
        return Response.status(Response.Status.CREATED.getStatusCode(), "Consulta Created").build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Receta obj){
        Receta tmp = rep.findById(Math.toIntExact(id));
        tmp.setComentarios_rece(obj.getComentarios_rece());
        tmp.setDuracionA_rece(obj.getDuracionA_rece());
        tmp.setDuracionD_rece(obj.getDuracionD_rece());
        tmp.setDuracionM_rece(obj.getDuracionM_rece());
        tmp.setId_consulta_rece(obj.getId_consulta_rece());
        tmp.setMotivos_rece(obj.getMotivos_rece());
        tmp.setVia_administracion_rece(obj.getVia_administracion_rece());
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        rep.deleteById(Math.toIntExact(id));
    }
}
