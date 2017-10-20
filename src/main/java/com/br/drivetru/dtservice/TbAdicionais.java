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
@Table(name = "tb_adicionais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAdicionais.findAll", query = "SELECT t FROM TbAdicionais t"),
    @NamedQuery(name = "TbAdicionais.findByIdAdicionais", query = "SELECT t FROM TbAdicionais t WHERE t.idAdicionais = :idAdicionais"),
    @NamedQuery(name = "TbAdicionais.findByIdTbVendas", query = "SELECT t FROM TbAdicionais t WHERE t.tbVendasIdVendas = :idTbVendas"),
    @NamedQuery(name = "TbAdicionais.findByPotencia", query = "SELECT t FROM TbAdicionais t WHERE t.potencia = :potencia"),
    @NamedQuery(name = "TbAdicionais.findByUnicoDono", query = "SELECT t FROM TbAdicionais t WHERE t.unicoDono = :unicoDono"),
    @NamedQuery(name = "TbAdicionais.findByDirecao", query = "SELECT t FROM TbAdicionais t WHERE t.direcao = :direcao"),
    @NamedQuery(name = "TbAdicionais.findByControleTracao", query = "SELECT t FROM TbAdicionais t WHERE t.controleTracao = :controleTracao"),
    @NamedQuery(name = "TbAdicionais.findByTransmissao", query = "SELECT t FROM TbAdicionais t WHERE t.transmissao = :transmissao")})
public class TbAdicionais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_adicionais")
    private Integer idAdicionais;
    @Size(max = 20)
    @Column(name = "potencia")
    private String potencia;
    @Size(max = 10)
    @Column(name = "unico_dono")
    private String unicoDono;
    @Size(max = 15)
    @Column(name = "direcao")
    private String direcao;
    @Size(max = 10)
    @Column(name = "controle_tracao")
    private String controleTracao;
    @Size(max = 15)
    @Column(name = "transmissao")
    private String transmissao;
    @Column(name = "tb_vendas_id_vendas")
    private Integer tbVendasIdVendas;
    

    public TbAdicionais() {
    }

    public TbAdicionais(Integer idAdicionais) {
        this.idAdicionais = idAdicionais;
    }

    public Integer getIdAdicionais() {
        return idAdicionais;
    }

    public void setIdAdicionais(Integer idAdicionais) {
        this.idAdicionais = idAdicionais;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getUnicoDono() {
        return unicoDono;
    }

    public void setUnicoDono(String unicoDono) {
        this.unicoDono = unicoDono;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public String getControleTracao() {
        return controleTracao;
    }

    public void setControleTracao(String controleTracao) {
        this.controleTracao = controleTracao;
    }

    public String getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
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
        hash += (idAdicionais != null ? idAdicionais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAdicionais)) {
            return false;
        }
        TbAdicionais other = (TbAdicionais) object;
        if ((this.idAdicionais == null && other.idAdicionais != null) || (this.idAdicionais != null && !this.idAdicionais.equals(other.idAdicionais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.drivetru.dtservice.TbAdicionais[ idAdicionais=" + idAdicionais + " ]";
    }
    
}
