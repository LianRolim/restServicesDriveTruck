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
@Table(name = "tb_ficha_tecnica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbFichaTecnica.findAll", query = "SELECT t FROM TbFichaTecnica t"),
    @NamedQuery(name = "TbFichaTecnica.findByIdFichaTecnica", query = "SELECT t FROM TbFichaTecnica t WHERE t.idFichaTecnica = :idFichaTecnica"),
    @NamedQuery(name = "TbFichaTecnica.findByIdVenda", query = "SELECT t FROM TbFichaTecnica t WHERE t.tbVendasIdVendas = :idVenda"),
    @NamedQuery(name = "TbFichaTecnica.findByMarcaMotor", query = "SELECT t FROM TbFichaTecnica t WHERE t.marcaMotor = :marcaMotor"),
    @NamedQuery(name = "TbFichaTecnica.findByMarca", query = "SELECT t FROM TbFichaTecnica t WHERE t.marca = :marca"),
    @NamedQuery(name = "TbFichaTecnica.findByQuilometros", query = "SELECT t FROM TbFichaTecnica t WHERE t.quilometros = :quilometros"),
    @NamedQuery(name = "TbFichaTecnica.findByCapacidadeCarga", query = "SELECT t FROM TbFichaTecnica t WHERE t.capacidadeCarga = :capacidadeCarga"),
    @NamedQuery(name = "TbFichaTecnica.findByModelo", query = "SELECT t FROM TbFichaTecnica t WHERE t.modelo = :modelo"),
    @NamedQuery(name = "TbFichaTecnica.findByAnoModelo", query = "SELECT t FROM TbFichaTecnica t WHERE t.anoModelo = :anoModelo")})
public class TbFichaTecnica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ficha_tecnica")
    private Integer idFichaTecnica;
    @Size(max = 20)
    @Column(name = "marca_motor")
    private String marcaMotor;
    @Size(max = 20)
    @Column(name = "marca")
    private String marca;
    @Size(max = 15)
    @Column(name = "quilometros")
    private String quilometros;
    @Size(max = 15)
    @Column(name = "capacidade_carga")
    private String capacidadeCarga;
    @Size(max = 20)
    @Column(name = "modelo")
    private String modelo;
    @Size(max = 15)
    @Column(name = "ano_modelo")
    private String anoModelo;
    /*@JoinColumn(name = "tb_vendas_id_vendas", referencedColumnName = "id_vendas")
    @ManyToOne(optional = false)*/
    @Column(name = "tb_vendas_id_vendas")
    private Integer tbVendasIdVendas;

    public TbFichaTecnica() {
    }

    public TbFichaTecnica(Integer idFichaTecnica) {
        this.idFichaTecnica = idFichaTecnica;
    }

    public Integer getIdFichaTecnica() {
        return idFichaTecnica;
    }

    public void setIdFichaTecnica(Integer idFichaTecnica) {
        this.idFichaTecnica = idFichaTecnica;
    }

    public String getMarcaMotor() {
        return marcaMotor;
    }

    public void setMarcaMotor(String marcaMotor) {
        this.marcaMotor = marcaMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(String quilometros) {
        this.quilometros = quilometros;
    }

    public String getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(String capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
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

    public Integer getTbVendasIdVendas() {
        return tbVendasIdVendas;
    }

    public void setTbVendasIdVendas(Integer tbVendasIdVendas) {
        this.tbVendasIdVendas = tbVendasIdVendas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFichaTecnica != null ? idFichaTecnica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbFichaTecnica)) {
            return false;
        }
        TbFichaTecnica other = (TbFichaTecnica) object;
        if ((this.idFichaTecnica == null && other.idFichaTecnica != null) || (this.idFichaTecnica != null && !this.idFichaTecnica.equals(other.idFichaTecnica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.drivetru.dtservice.TbFichaTecnica[ idFichaTecnica=" + idFichaTecnica + " ]";
    }
    
}
