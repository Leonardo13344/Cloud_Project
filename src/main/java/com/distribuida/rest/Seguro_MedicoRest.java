package com.distribuida.rest;






import com.distribuida.db.Seguro_Medico;
import com.distribuida.rep.Seguro_MedicoRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/segurosmedicos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class Seguro_MedicoRest {

    @Inject
    Seguro_MedicoRepository rep;

    @GET
    public List<Seguro_Medico> findAll(){
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
    public Response create(Seguro_Medico entity){
        rep.persist(entity);
        return Response.status(Response.Status.CREATED.getStatusCode(), "Consulta Created").build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Seguro_Medico obj){
        Seguro_Medico tmp = rep.findById(Math.toIntExact(id));
        tmp.setCompania_segmed(obj.getCompania_segmed());
        tmp.setFecha_segmed(obj.getFecha_segmed());
        tmp.setId_paciente_segmed(obj.getId_paciente_segmed());
        tmp.setNombre_segmed(obj.getNombre_segmed());
        tmp.setNum_poliza_segmed(obj.getNum_poliza_segmed());
        tmp.setPorc_cobert_segmed(obj.getPorc_cobert_segmed());
        tmp.setTipo_segmed(obj.getTipo_segmed());
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        rep.deleteById(Math.toIntExact(id));
    }
}
