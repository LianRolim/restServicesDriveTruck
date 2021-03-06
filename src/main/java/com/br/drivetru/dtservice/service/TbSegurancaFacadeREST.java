/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.drivetru.dtservice.service;

import com.br.drivetru.dtservice.TbSeguranca;
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

/**
 *
 * @author LIANCARLORolim
 */
@Stateless
@Path("seguranca")
public class TbSegurancaFacadeREST extends AbstractFacade<TbSeguranca> {
    @PersistenceContext(unitName = "com.br.driveTru_dtService_war_1.0PU")
    private EntityManager em;
    private List seguranca;

    public TbSegurancaFacadeREST() {
        super(TbSeguranca.class);
    }

    @POST
    @Override
    @Consumes({"application/json"})
    public void create(TbSeguranca entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/json"})
    public void edit(@PathParam("id") Integer id, TbSeguranca entity) {
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
    public TbSeguranca find(@PathParam("id") Integer id) {
        return super.find(id);
    }
    
    @GET
    @Path("findSGByVenda/{id}")
    @Produces({"application/json"})
    public List <TbSeguranca> findSGByVenda(@PathParam("id") Integer id) {
        
        seguranca = getEntityManager().createNamedQuery("TbSeguranca.findByIdVenda")
                                      .setParameter("idVenda", id).getResultList();
        
        return seguranca;
    }
    
    @GET
    @Override
    @Produces({"application/json"})
    public List<TbSeguranca> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/json"})
    public List<TbSeguranca> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
