/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.drivetru.dtservice;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LIANCARLORolim
 */
@Entity
@Table(name = "tb_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUsuario.findAll", query = "SELECT t FROM TbUsuario t"),
    @NamedQuery(name = "TbUsuario.findByIdUsuario", query = "SELECT t FROM TbUsuario t WHERE t.idUsuario = :idUsuario"),
    @NamedQuery(name = "TbUsuario.findByNome", query = "SELECT t.primeiroNome, t.segundoNome, t.nomeEmpresa FROM TbUsuario t WHERE t.idUsuario = :idUsuario"),
    @NamedQuery(name = "TbUsuario.findByEmail", query = "SELECT t FROM TbUsuario t WHERE t.email = :email"),
    @NamedQuery(name = "TbUsuario.findBySenha", query = "SELECT t FROM TbUsuario t WHERE t.senha = :senha"),
    @NamedQuery(name = "TbUsuario.findByPerfil", query = "SELECT t FROM TbUsuario t WHERE t.perfil = :perfil"),
    @NamedQuery(name = "TbUsuario.findByPrimeiroNome", query = "SELECT t FROM TbUsuario t WHERE t.primeiroNome = :primeiroNome"),
    @NamedQuery(name = "TbUsuario.findBySegundoNome", query = "SELECT t FROM TbUsuario t WHERE t.segundoNome = :segundoNome"),
    @NamedQuery(name = "TbUsuario.findByDataNascimento", query = "SELECT t FROM TbUsuario t WHERE t.dataNascimento = :dataNascimento"),
    @NamedQuery(name = "TbUsuario.findByFotoPerfil", query = "SELECT t FROM TbUsuario t WHERE t.fotoPerfil = :fotoPerfil"),
    @NamedQuery(name = "TbUsuario.findByTpoCnh", query = "SELECT t FROM TbUsuario t WHERE t.tpoCnh = :tpoCnh"),
    @NamedQuery(name = "TbUsuario.findByExperienciaProfissional", query = "SELECT t FROM TbUsuario t WHERE t.experienciaProfissional = :experienciaProfissional")})
public class TbUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email")
    private String email;
    @Size(max = 255)
    @Column(name = "senha")
    private String senha;
    @Size(max = 20)
    @Column(name = "perfil")
    private String perfil;
    @Size(max = 20)
    @Column(name = "primeiro_nome")
    private String primeiroNome;
    @Size(max = 20)
    @Column(name = "segundo_nome")
    private String segundoNome;
    @Column(name = "data_nascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Column(name = "foto_perfil")
    @Lob
    private String fotoPerfil;
    @Size(max = 15)
    @Column(name = "tpo_cnh")
    private String tpoCnh;
    @Size(max = 255)
    @Column(name = "experiencia_profissional")
    private String experienciaProfissional;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "nome_empresa")
    private String nomeEmpresa;
    @Column(name = "horarioAtendimento")
    private String horarioAtendimento;
    
    /*
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "tbUsuarioIdUsuario")
    private Collection<TbVendas> tbVendasCollection;
    */
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "tbUsuarioIdUsuario")
    private Collection<TbVagas> tbVagasCollection;*/

    public TbUsuario() {
    }
    
    public TbUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public String getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(String horarioString) {
        this.horarioAtendimento = horarioAtendimento;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getTpoCnh() {
        return tpoCnh;
    }

    public void setTpoCnh(String tpoCnh) {
        this.tpoCnh = tpoCnh;
    }

    public String getExperienciaProfissional() {
        return experienciaProfissional;
    }

    public void setExperienciaProfissional(String experienciaProfissional) {
        this.experienciaProfissional = experienciaProfissional;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    /*@XmlTransient
    public Collection<TbVendas> getTbVendasCollection() {
        return tbVendasCollection;
    }

    public void setTbVendasCollection(Collection<TbVendas> tbVendasCollection) {
        this.tbVendasCollection = tbVendasCollection;
    }*/

    /*@XmlTransient
    public Collection<TbVagas> getTbVagasCollection() {
        return tbVagasCollection;
    }

    public void setTbVagasCollection(Collection<TbVagas> tbVagasCollection) {
        this.tbVagasCollection = tbVagasCollection;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUsuario)) {
            return false;
        }
        TbUsuario other = (TbUsuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.drivetru.dtservice.TbUsuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
