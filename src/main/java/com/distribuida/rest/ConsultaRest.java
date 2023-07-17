package com.distribuida.rest;

import com.distribuida.db.Consulta;
import com.distribuida.rep.ConsultaRepository;
import com.distribuida.service.CrudServices;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/consultas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class ConsultaRest extends CrudServices<Consulta>{

    @Inject
    ConsultaRepository rep;





}
