/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moasirh.model;

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

/**
 *
 * @author T107
 */
@Entity
@Table(name = "pantalones")
@NamedQueries({
    @NamedQuery(name = "Pantalones.findAll", query = "SELECT p FROM Pantalones p")})
public class Pantalones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpantalon")
    private Integer idpantalon;
    @Size(max = 20)
    @Column(name = "corte")
    private String corte;
    @Column(name = "talla")
    private Integer talla;
    @Size(max = 20)
    @Column(name = "tipo")
    private String tipo;

    public Pantalones() {
    }

    public Pantalones(Integer idpantalon) {
        this.idpantalon = idpantalon;
    }

    public Integer getIdpantalon() {
        return idpantalon;
    }

    public void setIdpantalon(Integer idpantalon) {
        this.idpantalon = idpantalon;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public Integer getTalla() {
        return talla;
    }

    public void setTalla(Integer talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpantalon != null ? idpantalon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pantalones)) {
            return false;
        }
        Pantalones other = (Pantalones) object;
        if ((this.idpantalon == null && other.idpantalon != null) || (this.idpantalon != null && !this.idpantalon.equals(other.idpantalon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.moasirh.model.Pantalones[ idpantalon=" + idpantalon + " ]";
    }
    
}
