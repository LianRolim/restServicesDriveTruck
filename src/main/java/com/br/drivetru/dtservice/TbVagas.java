/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.drivetru.dtservice;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LIANCARLORolim
 */
@Entity
@Table(name = "tb_vagas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbVagas.findAll", query = "SELECT t FROM TbVagas t"),
    @NamedQuery(name = "TbVagas.findByIdVagas", query = "SELECT t FROM TbVagas t WHERE t.idVagas = :idVagas"),
    @NamedQuery(name = "TbVagas.findByNome", query = "SELECT t FROM TbVagas t WHERE t.nome = :nome"),
    @NamedQuery(name = "TbVagas.findByDescricao", query = "SELECT t FROM TbVagas t WHERE t.descricao = :descricao"),
    @NamedQuery(name = "TbVagas.findByTempoDeTrabalho", query = "SELECT t FROM TbVagas t WHERE t.tempoDeTrabalho = :tempoDeTrabalho"),
    @NamedQuery(name = "TbVagas.findByCarteiraAssinada", query = "SELECT t FROM TbVagas t WHERE t.carteiraAssinada = :carteiraAssinada"),
    @NamedQuery(name = "TbVagas.findByNumeroViagens", query = "SELECT t FROM TbVagas t WHERE t.numeroViagens = :numeroViagens"),
    @NamedQuery(name = "TbVagas.findByRequisitos", query = "SELECT t FROM TbVagas t WHERE t.requisitos = :requisitos"),
    @NamedQuery(name = "TbVagas.findByAtividades", query = "SELECT t FROM TbVagas t WHERE t.atividades = :atividades"),
    @NamedQuery(name = "TbVagas.findByJornadaTrabalho", query = "SELECT t FROM TbVagas t WHERE t.jornadaTrabalho = :jornadaTrabalho"),
    @NamedQuery(name = "TbVagas.findBySalario", query = "SELECT t FROM TbVagas t WHERE t.salario = :salario"),
    @NamedQuery(name = "TbVagas.findByBeneficios", query = "SELECT t FROM TbVagas t WHERE t.beneficios = :beneficios"),
    @NamedQuery(name = "TbVagas.findByCidadeEstado", query = "SELECT t FROM TbVagas t WHERE t.cidadeEstado = :cidadeEstado")})
public class TbVagas implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "tbVagasIdVagas")
    private Collection<TbRequisitos> tbRequisitosCollection;*/
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "tbVagasIdVagas")
    private Collection<TbAtividades> tbAtividadesCollection;*/
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "tbVagasIdVagas")
    private Collection<TbBeneficios> tbBeneficiosCollection;*/
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_vagas")
    private Integer idVagas;
    @Size(max = 30)
    @Column(name = "nome")
    private String nome;
    @Size(max = 255)
    @Column(name = "descricao")
    private String descricao;
    @Size(max = 40)
    @Column(name = "tempo_de_trabalho")
    private String tempoDeTrabalho;
    @Column(name = "carteira_assinada")
    private Character carteiraAssinada;
    @Column(name = "numero_viagens")
    private Integer numeroViagens;
    @Size(max = 255)
    @Column(name = "requisitos")
    private String requisitos;
    @Size(max = 255)
    @Column(name = "atividades")
    private String atividades;
    @Size(max = 50)
    @Column(name = "jornada_trabalho")
    private String jornadaTrabalho;
    @Column(name = "salario")
    private Integer salario;
    @Size(max = 30)
    @Column(name = "beneficios")
    private String beneficios;
    @Size(max = 50)
    @Column(name = "cidade_estado")
    private String cidadeEstado;
    /*@JoinColumn(name = "tb_usuario_id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)*/
    @Column(name = "tb_usuario_id_usuario")
    private Integer tbUsuarioIdUsuario;

    public TbVagas() {
    }

    public TbVagas(Integer idVagas) {
        this.idVagas = idVagas;
    }

    public Integer getIdVagas() {
        return idVagas;
    }

    public void setIdVagas(Integer idVagas) {
        this.idVagas = idVagas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTempoDeTrabalho() {
        return tempoDeTrabalho;
    }

    public void setTempoDeTrabalho(String tempoDeTrabalho) {
        this.tempoDeTrabalho = tempoDeTrabalho;
    }

    public Character getCarteiraAssinada() {
        return carteiraAssinada;
    }

    public void setCarteiraAssinada(Character carteiraAssinada) {
        this.carteiraAssinada = carteiraAssinada;
    }

    public Integer getNumeroViagens() {
        return numeroViagens;
    }

    public void setNumeroViagens(Integer numeroViagens) {
        this.numeroViagens = numeroViagens;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getAtividades() {
        return atividades;
    }

    public void setAtividades(String atividades) {
        this.atividades = atividades;
    }

    public String getJornadaTrabalho() {
        return jornadaTrabalho;
    }

    public void setJornadaTrabalho(String jornadaTrabalho) {
        this.jornadaTrabalho = jornadaTrabalho;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public String getCidadeEstado() {
        return cidadeEstado;
    }

    public void setCidadeEstado(String cidadeEstado) {
        this.cidadeEstado = cidadeEstado;
    }

    public Integer getTbUsuarioIdUsuario() {
        return tbUsuarioIdUsuario;
    }

    public void setTbUsuarioIdUsuario(Integer tbUsuarioIdUsuario) {
        this.tbUsuarioIdUsuario = tbUsuarioIdUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVagas != null ? idVagas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbVagas)) {
            return false;
        }
        TbVagas other = (TbVagas) object;
        if ((this.idVagas == null && other.idVagas != null) || (this.idVagas != null && !this.idVagas.equals(other.idVagas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.drivetru.dtservice.TbVagas[ idVagas=" + idVagas + " ]";
    }
    
    
    /*@XmlTransient
    public Collection<TbRequisitos> getTbRequisitosCollection() {
        return tbRequisitosCollection;
    }

    public void setTbRequisitosCollection(Collection<TbRequisitos> tbRequisitosCollection) {
        this.tbRequisitosCollection = tbRequisitosCollection;
    }*/

    /*@XmlTransient
    public Collection<TbAtividades> getTbAtividadesCollection() {
        return tbAtividadesCollection;
    }

    public void setTbAtividadesCollection(Collection<TbAtividades> tbAtividadesCollection) {
        this.tbAtividadesCollection = tbAtividadesCollection;
    }*/
    
    /*
    @XmlTransient
    public Collection<TbBeneficios> getTbBeneficiosCollection() {
        return tbBeneficiosCollection;
    }

    public void setTbBeneficiosCollection(Collection<TbBeneficios> tbBeneficiosCollection) {
        this.tbBeneficiosCollection = tbBeneficiosCollection;
    }*/
    
}
