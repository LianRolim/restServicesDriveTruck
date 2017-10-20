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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tb_som")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbSom.findAll", query = "SELECT t FROM TbSom t"),
    @NamedQuery(name = "TbSom.findByIdSom", query = "SELECT t FROM TbSom t WHERE t.idSom = :idSom"),
    @NamedQuery(name = "TbSom.findByIdVenda", query = "SELECT t FROM TbSom t WHERE t.tbVendasIdVendas = :idVenda"),
    @NamedQuery(name = "TbSom.findByNome", query = "SELECT t FROM TbSom t WHERE t.nome = :nome")})
public class TbSom implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_som")
    private Integer idSom;
    @Size(max = 50)
    @Column(name = "nome")
    private String nome;
    @Column(name = "tb_vendas_id_vendas")
    private Integer tbVendasIdVendas;

    public TbSom() {
    }

    public TbSom(Integer idSom) {
        this.idSom = idSom;
    }

    public Integer getIdSom() {
        return idSom;
    }

    public void setIdSom(Integer idSom) {
        this.idSom = idSom;
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
        hash += (idSom != null ? idSom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbSom)) {
            return false;
        }
        TbSom other = (TbSom) object;
        if ((this.idSom == null && other.idSom != null) || (this.idSom != null && !this.idSom.equals(other.idSom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.drivetru.dtservice.TbSom[ idSom=" + idSom + " ]";
    }
    
}
