package com.distribuida.rest;





import com.distribuida.db.Factura;
import com.distribuida.rep.FacturaRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/facturas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class FacturaRest {

    @Inject
    FacturaRepository rep;

    @GET
    public List<Factura> findAll(){
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
    public Response create(Factura entity){
        rep.persist(entity);
        return Response.status(Response.Status.CREATED.getStatusCode(), "Consulta Created").build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Factura obj){
        Factura tmp = rep.findById(Math.toIntExact(id));
        tmp.setDescripcion_fact(obj.getDescripcion_fact());
        tmp.setFecha_emision_fact(obj.getFecha_emision_fact());
        tmp.setMonto_fact(obj.getMonto_fact());
        tmp.setId_receta_fact(obj.getId_receta_fact());
        tmp.setMetodo_pago_fact(obj.getMetodo_pago_fact());
        tmp.setFecha_emision_fact(obj.getFecha_emision_fact());
        tmp.setPaciente_fact(obj.getPaciente_fact());
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        rep.deleteById(Math.toIntExact(id));
    }
}
