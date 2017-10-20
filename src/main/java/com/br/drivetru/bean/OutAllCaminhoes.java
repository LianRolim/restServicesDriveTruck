/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.drivetru.bean;

/**
 *
 * @author LIANCARLORolim
 */
public class OutAllCaminhoes {
   
    Integer idVendas;
    Integer tbUsuarioIdUsuario;
    String nomeVeiculo;
    String modelo;
    String anoModelo;
    Double valor;
    String cidadeEstado;
    String tpoAnuncio;
    String img01;
    String primeiroNome;
    String segundoNome;
    String nomeEmpresa;
    
    
    public OutAllCaminhoes(){}
    
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    public Integer getIdVendas() {
        return idVendas;
    }

    public void setIdVendas(Integer idVendas) {
        this.idVendas = idVendas;
    }

    public Integer getTbUsuarioIdUsuario() {
        return tbUsuarioIdUsuario;
    }

    public void setTbUsuarioIdUsuario(Integer tbUsuarioIdUsuario) {
        this.tbUsuarioIdUsuario = tbUsuarioIdUsuario;
    }

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getCidadeEstado() {
        return cidadeEstado;
    }

    public void setCidadeEstado(String cidadeEstado) {
        this.cidadeEstado = cidadeEstado;
    }

    public String getTpoAnuncio() {
        return tpoAnuncio;
    }

    public void setTpoAnuncio(String tpoAnuncio) {
        this.tpoAnuncio = tpoAnuncio;
    }

    public String getImg01() {
        return img01;
    }

    public void setImg01(String img01) {
        this.img01 = img01;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }
    
}
