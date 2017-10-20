/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.drivetru.dtservice.service;

import com.br.drivetru.dtservice.TbVagas;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author LIANCARLORolim
 */
@Stateless
@Path("vagas")
public class TbVagasFacadeREST extends AbstractFacade<TbVagas> {
    @PersistenceContext(unitName = "com.br.driveTru_dtService_war_1.0PU")
    private EntityManager em;

    public TbVagasFacadeREST() {
        super(TbVagas.class);
    }

    @POST
    @Override
    @Consumes({"application/json"})
    public void create(TbVagas entity) {
        super.create(entity);
    }
    
    @POST
    @Path("cadastrarNovaVaga/")
    @Consumes({"application/json"})
    @Produces(MediaType.APPLICATION_JSON)
    public Response cadastrarNovaVaga(TbVagas entity) {

        em.persist(entity);
        em.flush();
        
        return Response.status(201).entity(entity.getIdVagas().toString()).build();
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/json"})
    public void edit(@PathParam("id") Integer id, TbVagas entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/json"})
    public TbVagas find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/json"})
    public List<TbVagas> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/json"})
    public List<TbVagas> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
