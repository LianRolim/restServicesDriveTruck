/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.drivetru.dtservice.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author LIANCARLORolim
 */
@javax.ws.rs.ApplicationPath("driveTruckService")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.br.drivetru.dtservice.service.TbAdicionaisFacadeREST.class);
        resources.add(com.br.drivetru.dtservice.service.TbAtividadesFacadeREST.class);
        resources.add(com.br.drivetru.dtservice.service.TbBeneficiosFacadeREST.class);
        resources.add(com.br.drivetru.dtservice.service.TbConfortoFacadeREST.class);
        resources.add(com.br.drivetru.dtservice.service.TbEquipamentosFacadeREST.class);
        resources.add(com.br.drivetru.dtservice.service.TbFichaTecnicaFacadeREST.class);
        resources.add(com.br.drivetru.dtservice.service.TbMensagensFacadeREST.class);
        resources.add(com.br.drivetru.dtservice.service.TbRequisitosFacadeREST.class);
        resources.add(com.br.drivetru.dtservice.service.TbSegurancaFacadeREST.class);
        resources.add(com.br.drivetru.dtservice.service.TbSomFacadeREST.class);
        resources.add(com.br.drivetru.dtservice.service.TbUsuarioFacadeREST.class);
        resources.add(com.br.drivetru.dtservice.service.TbVagasFacadeREST.class);
        resources.add(com.br.drivetru.dtservice.service.TbVendasFacadeREST.class);
    }
    
}
