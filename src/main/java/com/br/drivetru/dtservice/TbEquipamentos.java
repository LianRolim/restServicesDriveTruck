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
@Table(name = "tb_equipamentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbEquipamentos.findAll", query = "SELECT t FROM TbEquipamentos t"),
    @NamedQuery(name = "TbEquipamentos.findByIdEquipamentos", query = "SELECT t FROM TbEquipamentos t WHERE t.idEquipamentos = :idEquipamentos"),
    @NamedQuery(name = "TbEquipamentos.findByIdVenda", query = "SELECT t FROM TbEquipamentos t WHERE t.tbVendasIdVendas = :idVenda"),
    @NamedQuery(name = "TbEquipamentos.findByNome", query = "SELECT t FROM TbEquipamentos t WHERE t.nome = :nome")})
public class TbEquipamentos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_equipamentos")
    private Integer idEquipamentos;
    @Size(max = 50)
    @Column(name = "nome")
    private String nome;
    @Column(name = "tb_vendas_id_vendas")
    private Integer tbVendasIdVendas;

    public TbEquipamentos() {
    }

    public TbEquipamentos(Integer idEquipamentos) {
        this.idEquipamentos = idEquipamentos;
    }

    public Integer getIdEquipamentos() {
        return idEquipamentos;
    }

    public void setIdEquipamentos(Integer idEquipamentos) {
        this.idEquipamentos = idEquipamentos;
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
        hash += (idEquipamentos != null ? idEquipamentos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbEquipamentos)) {
            return false;
        }
        TbEquipamentos other = (TbEquipamentos) object;
        if ((this.idEquipamentos == null && other.idEquipamentos != null) || (this.idEquipamentos != null && !this.idEquipamentos.equals(other.idEquipamentos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.drivetru.dtservice.TbEquipamentos[ idEquipamentos=" + idEquipamentos + " ]";
    }
    
}
