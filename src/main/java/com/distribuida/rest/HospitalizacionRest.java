package com.distribuida.rest;






import com.distribuida.db.Hospitalizacion;
import com.distribuida.rep.HospitalizacionRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/hospitalizaciones")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class HospitalizacionRest {

    @Inject
    HospitalizacionRepository rep;

    @GET
    public List<Hospitalizacion> findAll(){
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
    public Response create(Hospitalizacion entity){
        rep.persist(entity);
        return Response.status(Response.Status.CREATED.getStatusCode(), "Consulta Created").build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Hospitalizacion obj){
        Hospitalizacion tmp = rep.findById(Math.toIntExact(id));
        tmp.setDescripcion_hosp(obj.getDescripcion_hosp());
        tmp.setFecha_fin_hosp(obj.getFecha_fin_hosp());
        tmp.setFecha_inic_hosp(obj.getFecha_inic_hosp());
        tmp.setPersonal_encarg_hosp(obj.getPersonal_encarg_hosp());
        tmp.setEstado_hosp(obj.getEstado_hosp());
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        rep.deleteById(Math.toIntExact(id));
    }
}
