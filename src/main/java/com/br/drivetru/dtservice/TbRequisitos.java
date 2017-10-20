/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.drivetru.dtservice;

import com.br.drivetru.dtservice.TbVagas;
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
@Table(name = "tb_requisitos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbRequisitos.findAll", query = "SELECT t FROM TbRequisitos t"),
    @NamedQuery(name = "TbRequisitos.findByIdRequisitos", query = "SELECT t FROM TbRequisitos t WHERE t.idRequisitos = :idRequisitos"),
    @NamedQuery(name = "TbRequisitos.findByNome", query = "SELECT t FROM TbRequisitos t WHERE t.nome = :nome")})
public class TbRequisitos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_requisitos")
    private Integer idRequisitos;
    @Size(max = 30)
    @Column(name = "nome")
    private String nome;
    /*@JoinColumn(name = "tb_vagas_id_vagas", referencedColumnName = "id_vagas")
    @ManyToOne(optional = false)*/
    @Column(name = "tb_vagas_id_vagas")
    private Integer tbVagasIdVagas;

    public TbRequisitos() {
    }

    public TbRequisitos(Integer idRequisitos) {
        this.idRequisitos = idRequisitos;
    }

    public Integer getIdRequisitos() {
        return idRequisitos;
    }

    public void setIdRequisitos(Integer idRequisitos) {
        this.idRequisitos = idRequisitos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTbVagasIdVagas() {
        return tbVagasIdVagas;
    }

    public void setTbVagasIdVagas(Integer tbVagasIdVagas) {
        this.tbVagasIdVagas = tbVagasIdVagas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRequisitos != null ? idRequisitos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbRequisitos)) {
            return false;
        }
        TbRequisitos other = (TbRequisitos) object;
        if ((this.idRequisitos == null && other.idRequisitos != null) || (this.idRequisitos != null && !this.idRequisitos.equals(other.idRequisitos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.drivetru.bean.TbRequisitos[ idRequisitos=" + idRequisitos + " ]";
    }
    
}
