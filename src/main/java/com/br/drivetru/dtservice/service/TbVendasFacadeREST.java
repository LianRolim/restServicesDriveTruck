/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.drivetru.dtservice.service;

import com.br.drivetru.dtservice.TbVendas;
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
import com.br.drivetru.bean.OutAllCaminhoes;
import com.br.drivetru.bean.OutDtlCaminhao;
import com.br.drivetru.bean.Usuario;
import java.util.ArrayList;
import java.util.Iterator;

// Wrapper
class Vendas {
  List<TbVendas> vendas;
}

/**
 *
 * @author LIANCARLORolim
 */
@Stateless
@Path("vendas")
public class TbVendasFacadeREST extends AbstractFacade<TbVendas> {
    @PersistenceContext(unitName = "com.br.driveTru_dtService_war_1.0PU")
    private EntityManager em;
    private List novaVenda;
    private List caminhoes;
    
    
    
    private List<OutAllCaminhoes> Listcaminhoes;
    
    public TbVendasFacadeREST() {
        super(TbVendas.class);
    }

    @POST
    @Override
    @Consumes({"application/json"})
    public void create(TbVendas entity) {
        super.create(entity);
    }
    
    @POST
    @Path("createNovaVenda/")
    @Consumes({"application/json"})
    @Produces(MediaType.APPLICATION_JSON)
    public Response createNovoCaminhaoVenda(TbVendas entity) {

        em.persist(entity);
        em.flush();
        
        return Response.status(201).entity(entity.getIdVendas().toString()).build();
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/json"})
    public void edit(@PathParam("id") Integer id, TbVendas entity) {
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
    public TbVendas find(@PathParam("id") Integer id) {
        return super.find(id);
    }
    
    @GET
    @Path("/listCaminhoes")
    @Produces({"application/json"})
    public List<OutAllCaminhoes> findCaminhoes() {
        List resultadoVendas;
        List<OutAllCaminhoes> vendas = new ArrayList<OutAllCaminhoes>();
        List usuario;
        
        resultadoVendas = getEntityManager().createNamedQuery("TbVendas.findAllApresentaCaminhoes").getResultList();
        
        
        for (Iterator<TbVendas> it = resultadoVendas.iterator(); it.hasNext();) {
            TbVendas resu = it.next();
            OutAllCaminhoes cam = new OutAllCaminhoes();
            cam.setIdVendas(resu.getIdVendas());
            cam.setTbUsuarioIdUsuario(resu.getTbUsuarioIdUsuario());
            cam.setNomeVeiculo(resu.getNomeVeiculo());
            cam.setModelo(resu.getModelo());
            cam.setAnoModelo(resu.getAnoModelo());
            cam.setValor(resu.getValor());
            cam.setCidadeEstado(resu.getCidadeEstado());
            cam.setTpoAnuncio(resu.getTipoAnuncio());
            cam.setImg01(resu.getImg01());

            usuario =  getEntityManager().createNamedQuery("TbUsuario.findByNome")
                                         .setParameter("idUsuario", resu.getTbUsuarioIdUsuario())
                                         .getResultList();
            
            Iterator itr = usuario.iterator();
            while(itr.hasNext()){
               Object[] obj = (Object[]) itr.next();
               
               cam.setPrimeiroNome(String.valueOf(obj[0]));
               cam.setSegundoNome(String.valueOf(obj[1]));
               cam.setNomeEmpresa(String.valueOf(obj[2]));
            }
            
            vendas.add(cam);
        }
        
        return vendas;

    }
    
    @GET
    @Path("findVenda/")
    public List<TbVendas> findVenda(Vendas vendas) {
        
        vendas.toString();
        System.out.println(vendas.toString());
        return novaVenda;
    }
    
    
    
    @GET
    @Override
    @Produces({"application/json"})
    public List<TbVendas> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/json"})
    public List<TbVendas> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
