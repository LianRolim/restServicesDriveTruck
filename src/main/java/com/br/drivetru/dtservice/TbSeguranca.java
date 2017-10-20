/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.drivetru.dtservice;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LIANCARLORolim
 */
@Entity
@Table(name = "tb_seguranca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbSeguranca.findAll", query = "SELECT t FROM TbSeguranca t"),
    @NamedQuery(name = "TbSeguranca.findByIdSeguranca", query = "SELECT t FROM TbSeguranca t WHERE t.idSeguranca = :idSeguranca"),
    @NamedQuery(name = "TbSeguranca.findByIdVenda", query = "SELECT t FROM TbSeguranca t WHERE t.tbVendasIdVendas = :idVenda"),
    @NamedQuery(name = "TbSeguranca.findByNome", query = "SELECT t FROM TbSeguranca t WHERE t.nome = :nome")})
public class TbSeguranca implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_seguranca")
    private Integer idSeguranca;
    @Size(max = 50)
    @Column(name = "nome")
    private String nome;
    @Column(name = "tb_vendas_id_vendas")
    private Integer tbVendasIdVendas;

    public TbSeguranca() {
    }

    public TbSeguranca(Integer idSeguranca) {
        this.idSeguranca = idSeguranca;
    }

    public Integer getIdSeguranca() {
        return idSeguranca;
    }

    public void setIdSeguranca(Integer idSeguranca) {
        this.idSeguranca = idSeguranca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTbVendasIdVendas() {
        return tbVendasIdVendas;
    }

    public void setTbVendasIdVendas(Integer tbVendasIdVendas) {
        this.tbVendasIdVendas = tbVendasIdVendas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSeguranca != null ? idSeguranca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbSeguranca)) {
            return false;
        }
        TbSeguranca other = (TbSeguranca) object;
        if ((this.idSeguranca == null && other.idSeguranca != null) || (this.idSeguranca != null && !this.idSeguranca.equals(other.idSeguranca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.drivetru.dtservice.TbSeguranca[ idSeguranca=" + idSeguranca + " ]";
    }
    
}
