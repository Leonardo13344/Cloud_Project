package com.distribuida.rest;






import com.distribuida.db.Proveedor;
import com.distribuida.rep.ProveedorRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/proveedores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class ProveedorRest {

    @Inject
    ProveedorRepository rep;

    @GET
    public List<Proveedor> findAll(){
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
    public Response create(Proveedor entity){
        rep.persist(entity);
        return Response.status(Response.Status.CREATED.getStatusCode(), "Consulta Created").build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Proveedor obj){
        Proveedor tmp = rep.findById(Math.toIntExact(id));
        tmp.setDescuento_prov(obj.getDescuento_prov());
        tmp.setDireccion_prov(obj.getDireccion_prov());
        tmp.setTelefono_prov(obj.getTelefono_prov());
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        rep.deleteById(Math.toIntExact(id));
    }
}
