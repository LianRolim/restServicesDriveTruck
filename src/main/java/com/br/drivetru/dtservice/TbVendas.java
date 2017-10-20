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
import javax.persistence.Lob;
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
@Table(name = "tb_vendas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbVendas.findAll", query = "SELECT t FROM TbVendas t"),
    @NamedQuery(name = "TbVendas.findAllApresentaCaminhoes", query = "SELECT t FROM TbVendas t"),
    @NamedQuery(name = "TbVendas.findByIdVendas", query = "SELECT t FROM TbVendas t WHERE t.idVendas = :idVendas"),
    @NamedQuery(name = "TbVendas.findByNomeVeiculo", query = "SELECT t FROM TbVendas t WHERE t.nomeVeiculo = :nomeVeiculo"),
    @NamedQuery(name = "TbVendas.findByModelo", query = "SELECT t FROM TbVendas t WHERE t.modelo = :modelo"),
    @NamedQuery(name = "TbVendas.findByAnoModelo", query = "SELECT t FROM TbVendas t WHERE t.anoModelo = :anoModelo"),
    @NamedQuery(name = "TbVendas.findByValor", query = "SELECT t FROM TbVendas t WHERE t.valor = :valor"),
    @NamedQuery(name = "TbVendas.findByCidadeEstado", query = "SELECT t FROM TbVendas t WHERE t.cidadeEstado = :cidadeEstado"),
    @NamedQuery(name = "TbVendas.findByTipoAnuncio", query = "SELECT t FROM TbVendas t WHERE t.tipoAnuncio = :tipoAnuncio"),
    @NamedQuery(name = "TbVendas.findByDescricao", query = "SELECT t FROM TbVendas t WHERE t.descricao = :descricao"),
    @NamedQuery(name = "TbVendas.findByNovoRegistro", query = "SELECT t FROM TbVendas t WHERE t.tbUsuarioIdUsuario = :tbUsuarioIdUsuario AND t.nomeVeiculo = :nomeVeiculo AND t.modelo = :modelo AND t.anoModelo = :anoModelo AND t.valor = :valor AND t.tipoAnuncio = :tipoAnuncio")})

public class TbVendas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_vendas")
    private Integer idVendas;
    @Size(max = 50)
    @Column(name = "nome_veiculo")
    private String nomeVeiculo;
    @Size(max = 30)
    @Column(name = "modelo")
    private String modelo;
    @Size(max = 30)
    @Column(name = "ano_modelo")
    private String anoModelo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private Double valor;
    @Size(max = 50)
    @Column(name = "cidade_estado")
    private String cidadeEstado;
    @Size(max = 15)
    @Column(name = "tipo_anuncio")
    private String tipoAnuncio;
    @Size(max = 255)
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "telefone_fixo")
    private String telefoneFixo;
    @Size(max = 45)
    @Column(name = "telefone_cel")
    private String telefoneCel;
    @Size(max = 45)
    // aki aki
    @Column(name = "tb_usuario_id_usuario")
    private Integer tbUsuarioIdUsuario;
    @Column(name = "img01")
    @Lob
    private String img01;
    @Column(name = "img02")
    @Lob
    private String img02;
    @Column(name = "img03")
    @Lob
    private String img03;
    @Column(name = "img04")
    @Lob
    private String img04;
    @Column(name = "img05")
    @Lob
    private String img05;
    @Column(name = "img06")
    @Lob
    private String img06;
    @Column(name = "img07")
    @Lob
    private String img07;
    @Column(name = "img08")
    @Lob
    private String img08;
    @Column(name = "img09")
    @Lob
    private String img09;
    @Column(name = "img10")
    @Lob
    private String img10;
    
    public TbVendas() {
    }
    
    public TbVendas(Integer idVendas) {
        this.idVendas = idVendas;
    }

    public Integer getIdVendas() {
        return idVendas;
    }
    // aki aki
    public void setTbUsuarioIdUsuario(Integer tbUsuarioIdUsuario) {
        this.tbUsuarioIdUsuario = tbUsuarioIdUsuario;
    }

    public Integer getTbUsuarioIdUsuario() {
        return tbUsuarioIdUsuario;
    }
    
    public void setIdVendas(Integer idVendas) {
        this.idVendas = idVendas;
    }
    
    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }
    
    public String getTelefoneCel() {
        return telefoneCel;
    }

    public void setTelefoneCel(String telefoneCel) {
        this.telefoneCel = telefoneCel;
    }
    
    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getCidadeEstado() {
        return cidadeEstado;
    }

    public void setCidadeEstado(String cidadeEstado) {
        this.cidadeEstado = cidadeEstado;
    }

    public String getTipoAnuncio() {
        return tipoAnuncio;
    }

    public void setTipoAnuncio(String tipoAnuncio) {
        this.tipoAnuncio = tipoAnuncio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getImg01() {
        return img01;
    }

    public void setImg01(String img01) {
        this.img01 = img01;
    }
    
    public String getImg02() {
        return img02;
    }

    public void setImg02(String img02) {
        this.img02 = img02;
    }
    
    public String getImg03() {
        return img03;
    }

    public void setImg03(String img03) {
        this.img03 = img03;
    }
    
    public String getImg04() {
        return img04;
    }

    public void setImg04(String img04) {
        this.img04 = img04;
    }
    
    public String getImg05() {
        return img05;
    }

    public void setImg05(String img05) {
        this.img05 = img05;
    }
    
    public String getImg06() {
        return img06;
    }

    public void setImg06(String img06) {
        this.img06 = img06;
    }
    
    public String getImg07() {
        return img07;
    }

    public void setImg07(String img07) {
        this.img07 = img07;
    }
    
    public String getImg08() {
        return img08;
    }

    public void setImg08(String img08) {
        this.img08 = img08;
    }
    
    public String getImg09() {
        return img09;
    }

    public void setImg09(String img09) {
        this.img09 = img09;
    }
    
    public String getImg10() {
        return img10;
    }

    public void setImg10(String img10) {
        this.img10 = img10;
    }
  
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVendas != null ? idVendas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbVendas)) {
            return false;
        }
        TbVendas other = (TbVendas) object;
        if ((this.idVendas == null && other.idVendas != null) || (this.idVendas != null && !this.idVendas.equals(other.idVendas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.drivetru.dtservice.TbVendas[ idVendas=" + idVendas + " ]";
    }
    
}
