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
@Table(name = "tb_beneficios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbBeneficios.findAll", query = "SELECT t FROM TbBeneficios t"),
    @NamedQuery(name = "TbBeneficios.findByIdBeneficios", query = "SELECT t FROM TbBeneficios t WHERE t.idBeneficios = :idBeneficios"),
    @NamedQuery(name = "TbBeneficios.findByNome", query = "SELECT t FROM TbBeneficios t WHERE t.nome = :nome")})
public class TbBeneficios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_beneficios")
    private Integer idBeneficios;
    @Size(max = 30)
    @Column(name = "nome")
    private String nome;
    /*@JoinColumn(name = "tb_vagas_id_vagas", referencedColumnName = "id_vagas")
    @ManyToOne(optional = false)*/
    @Column(name = "tb_vagas_id_vagas")
    private Integer tbVagasIdVagas;

    public TbBeneficios() {
    }

    public TbBeneficios(Integer idBeneficios) {
        this.idBeneficios = idBeneficios;
    }

    public Integer getIdBeneficios() {
        return idBeneficios;
    }

    public void setIdBeneficios(Integer idBeneficios) {
        this.idBeneficios = idBeneficios;
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
        hash += (idBeneficios != null ? idBeneficios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbBeneficios)) {
            return false;
        }
        TbBeneficios other = (TbBeneficios) object;
        if ((this.idBeneficios == null && other.idBeneficios != null) || (this.idBeneficios != null && !this.idBeneficios.equals(other.idBeneficios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.drivetru.bean.TbBeneficios[ idBeneficios=" + idBeneficios + " ]";
    }
    
}
