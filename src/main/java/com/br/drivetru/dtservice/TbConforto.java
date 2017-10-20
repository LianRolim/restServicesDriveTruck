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
@Table(name = "tb_conforto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbConforto.findAll", query = "SELECT t FROM TbConforto t"),
    @NamedQuery(name = "TbConforto.findByIdConforto", query = "SELECT t FROM TbConforto t WHERE t.idConforto = :idConforto"),
    @NamedQuery(name = "TbConforto.findByIdVenda", query = "SELECT t FROM TbConforto t WHERE t.tbVendasIdVendas = :idVenda"),
    @NamedQuery(name = "TbConforto.findByNome", query = "SELECT t FROM TbConforto t WHERE t.nome = :nome")})
public class TbConforto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_conforto")
    private Integer idConforto;
    @Size(max = 50)
    @Column(name = "nome")
    private String nome;
    /*@JoinColumn(name = "tb_vendas_id_vendas", referencedColumnName = "id_vendas")
    @ManyToOne(optional = false)*/
    @Column(name = "tb_vendas_id_vendas")
    private Integer tbVendasIdVendas;

    public TbConforto() {
    }

    public TbConforto(Integer idConforto) {
        this.idConforto = idConforto;
    }

    public Integer getIdConforto() {
        return idConforto;
    }

    public void setIdConforto(Integer idConforto) {
        this.idConforto = idConforto;
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
        hash += (idConforto != null ? idConforto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbConforto)) {
            return false;
        }
        TbConforto other = (TbConforto) object;
        if ((this.idConforto == null && other.idConforto != null) || (this.idConforto != null && !this.idConforto.equals(other.idConforto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.drivetru.dtservice.TbConforto[ idConforto=" + idConforto + " ]";
    }
    
}
