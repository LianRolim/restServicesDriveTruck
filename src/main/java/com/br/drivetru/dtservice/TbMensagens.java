/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.drivetru.dtservice;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LIANCARLORolim
 */
@Entity
@Table(name = "tb_mensagens")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbMensagens.findAll", query = "SELECT t FROM TbMensagens t"),
    @NamedQuery(name = "TbMensagens.findByIdMensagens", query = "SELECT t FROM TbMensagens t WHERE t.idMensagens = :idMensagens"),
    @NamedQuery(name = "TbMensagens.findByIdUserEnv", query = "SELECT t FROM TbMensagens t WHERE t.idUserEnv = :idUserEnv"),
    @NamedQuery(name = "TbMensagens.findByIdUserRec", query = "SELECT t FROM TbMensagens t WHERE t.idUserRec = :idUserRec"),
    @NamedQuery(name = "TbMensagens.findByMensagem", query = "SELECT t FROM TbMensagens t WHERE t.mensagem = :mensagem"),
    @NamedQuery(name = "TbMensagens.findByDataHora", query = "SELECT t FROM TbMensagens t WHERE t.dataHora = :dataHora")})
public class TbMensagens implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_mensagens")
    private Integer idMensagens;
    @Column(name = "id_user_env")
    private Integer idUserEnv;
    @Column(name = "id_user_rec")
    private Integer idUserRec;
    @Size(max = 255)
    @Column(name = "mensagem")
    private String mensagem;
    @Column(name = "data_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;

    public TbMensagens() {
    }

    public TbMensagens(Integer idMensagens) {
        this.idMensagens = idMensagens;
    }

    public Integer getIdMensagens() {
        return idMensagens;
    }

    public void setIdMensagens(Integer idMensagens) {
        this.idMensagens = idMensagens;
    }

    public Integer getIdUserEnv() {
        return idUserEnv;
    }

    public void setIdUserEnv(Integer idUserEnv) {
        this.idUserEnv = idUserEnv;
    }

    public Integer getIdUserRec() {
        return idUserRec;
    }

    public void setIdUserRec(Integer idUserRec) {
        this.idUserRec = idUserRec;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMensagens != null ? idMensagens.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbMensagens)) {
            return false;
        }
        TbMensagens other = (TbMensagens) object;
        if ((this.idMensagens == null && other.idMensagens != null) || (this.idMensagens != null && !this.idMensagens.equals(other.idMensagens))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.drivetru.dtservice.TbMensagens[ idMensagens=" + idMensagens + " ]";
    }
    
}
