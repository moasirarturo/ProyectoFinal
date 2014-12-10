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
@Table(name = "corte")
@NamedQueries({
    @NamedQuery(name = "Corte.findAll", query = "SELECT c FROM Corte c")})
public class Corte implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcorte")
    private Integer idcorte;
    @Size(max = 20)
    @Column(name = "recto")
    private String recto;
    @Size(max = 20)
    @Column(name = "skinny")
    private String skinny;
    @Size(max = 20)
    @Column(name = "baggy")
    private String baggy;

    public Corte() {
    }

    public Corte(Integer idcorte) {
        this.idcorte = idcorte;
    }

    public Integer getIdcorte() {
        return idcorte;
    }

    public void setIdcorte(Integer idcorte) {
        this.idcorte = idcorte;
    }

    public String getRecto() {
        return recto;
    }

    public void setRecto(String recto) {
        this.recto = recto;
    }

    public String getSkinny() {
        return skinny;
    }

    public void setSkinny(String skinny) {
        this.skinny = skinny;
    }

    public String getBaggy() {
        return baggy;
    }

    public void setBaggy(String baggy) {
        this.baggy = baggy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcorte != null ? idcorte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Corte)) {
            return false;
        }
        Corte other = (Corte) object;
        if ((this.idcorte == null && other.idcorte != null) || (this.idcorte != null && !this.idcorte.equals(other.idcorte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.moasirh.model.Corte[ idcorte=" + idcorte + " ]";
    }
    
}
