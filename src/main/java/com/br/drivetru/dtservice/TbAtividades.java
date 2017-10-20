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
@Table(name = "tb_atividades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAtividades.findAll", query = "SELECT t FROM TbAtividades t"),
    @NamedQuery(name = "TbAtividades.findByIdAtividades", query = "SELECT t FROM TbAtividades t WHERE t.idAtividades = :idAtividades"),
    @NamedQuery(name = "TbAtividades.findByNome", query = "SELECT t FROM TbAtividades t WHERE t.nome = :nome")})
public class TbAtividades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_atividades")
    private Integer idAtividades;
    @Size(max = 30)
    @Column(name = "nome")
    private String nome;
    /*@JoinColumn(name = "tb_vagas_id_vagas", referencedColumnName = "id_vagas")
    @ManyToOne(optional = false)*/
    @Column(name = "tb_vagas_id_vagas")
    private Integer tbVagasIdVagas;

    public TbAtividades() {
    }

    public TbAtividades(Integer idAtividades) {
        this.idAtividades = idAtividades;
    }

    public Integer getIdAtividades() {
        return idAtividades;
    }

    public void setIdAtividades(Integer idAtividades) {
        this.idAtividades = idAtividades;
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
        hash += (idAtividades != null ? idAtividades.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAtividades)) {
            return false;
        }
        TbAtividades other = (TbAtividades) object;
        if ((this.idAtividades == null && other.idAtividades != null) || (this.idAtividades != null && !this.idAtividades.equals(other.idAtividades))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.drivetru.bean.TbAtividades[ idAtividades=" + idAtividades + " ]";
    }
    
}
