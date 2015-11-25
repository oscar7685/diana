/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diana.entidades;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "seguromedico", catalog = "seguromedico", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seguromedico.findAll", query = "SELECT s FROM Seguromedico s"),
    @NamedQuery(name = "Seguromedico.findByIdSeguroMedico", query = "SELECT s FROM Seguromedico s WHERE s.idSeguroMedico = :idSeguroMedico"),
    @NamedQuery(name = "Seguromedico.findByNif", query = "SELECT s FROM Seguromedico s WHERE s.nif = :nif"),
    @NamedQuery(name = "Seguromedico.findByNombre", query = "SELECT s FROM Seguromedico s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "Seguromedico.findByApe1", query = "SELECT s FROM Seguromedico s WHERE s.ape1 = :ape1"),
    @NamedQuery(name = "Seguromedico.findByEdad", query = "SELECT s FROM Seguromedico s WHERE s.edad = :edad"),
    @NamedQuery(name = "Seguromedico.findBySexo", query = "SELECT s FROM Seguromedico s WHERE s.sexo = :sexo"),
    @NamedQuery(name = "Seguromedico.findByCasado", query = "SELECT s FROM Seguromedico s WHERE s.casado = :casado"),
    @NamedQuery(name = "Seguromedico.findByNumhijos", query = "SELECT s FROM Seguromedico s WHERE s.numhijos = :numhijos"),
    @NamedQuery(name = "Seguromedico.findByEmbarazada", query = "SELECT s FROM Seguromedico s WHERE s.embarazada = :embarazada"),
    @NamedQuery(name = "Seguromedico.findByCoberturaoftalmologica", query = "SELECT s FROM Seguromedico s WHERE s.coberturaoftalmologica = :coberturaoftalmologica"),
    @NamedQuery(name = "Seguromedico.findByCoberturadental", query = "SELECT s FROM Seguromedico s WHERE s.coberturadental = :coberturadental"),
    @NamedQuery(name = "Seguromedico.findByCoberturafecundacioninvitro", query = "SELECT s FROM Seguromedico s WHERE s.coberturafecundacioninvitro = :coberturafecundacioninvitro"),
    @NamedQuery(name = "Seguromedico.findByEnfermedadcorazon", query = "SELECT s FROM Seguromedico s WHERE s.enfermedadcorazon = :enfermedadcorazon"),
    @NamedQuery(name = "Seguromedico.findByEnfermedadestomacal", query = "SELECT s FROM Seguromedico s WHERE s.enfermedadestomacal = :enfermedadestomacal"),
    @NamedQuery(name = "Seguromedico.findByEnfermedadrinyones", query = "SELECT s FROM Seguromedico s WHERE s.enfermedadrinyones = :enfermedadrinyones"),
    @NamedQuery(name = "Seguromedico.findByEnfermedadalergia", query = "SELECT s FROM Seguromedico s WHERE s.enfermedadalergia = :enfermedadalergia"),
    @NamedQuery(name = "Seguromedico.findByNombrealergia", query = "SELECT s FROM Seguromedico s WHERE s.nombrealergia = :nombrealergia")})
public class Seguromedico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSeguroMedico")
    private Integer idSeguroMedico;
    @Column(name = "nif")
    private String nif;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "ape1")
    private String ape1;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "casado")
    private Short casado;
    @Column(name = "numhijos")
    private Integer numhijos;
    @Column(name = "embarazada")
    private Short embarazada;
    @Column(name = "coberturaoftalmologica")
    private Short coberturaoftalmologica;
    @Column(name = "coberturadental")
    private Short coberturadental;
    @Column(name = "coberturafecundacioninvitro")
    private Short coberturafecundacioninvitro;
    @Column(name = "enfermedadcorazon")
    private Short enfermedadcorazon;
    @Column(name = "enfermedadestomacal")
    private Short enfermedadestomacal;
    @Column(name = "enfermedadrinyones")
    private Short enfermedadrinyones;
    @Column(name = "enfermedadalergia")
    private Short enfermedadalergia;
    @Column(name = "nombrealergia")
    private String nombrealergia;

    public Seguromedico() {
    }

    public Seguromedico(Integer idSeguroMedico) {
        this.idSeguroMedico = idSeguroMedico;
    }

    public Integer getIdSeguroMedico() {
        return idSeguroMedico;
    }

    public void setIdSeguroMedico(Integer idSeguroMedico) {
        this.idSeguroMedico = idSeguroMedico;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Short getCasado() {
        return casado;
    }

    public void setCasado(Short casado) {
        this.casado = casado;
    }

    public Integer getNumhijos() {
        return numhijos;
    }

    public void setNumhijos(Integer numhijos) {
        this.numhijos = numhijos;
    }

    public Short getEmbarazada() {
        return embarazada;
    }

    public void setEmbarazada(Short embarazada) {
        this.embarazada = embarazada;
    }

    public Short getCoberturaoftalmologica() {
        return coberturaoftalmologica;
    }

    public void setCoberturaoftalmologica(Short coberturaoftalmologica) {
        this.coberturaoftalmologica = coberturaoftalmologica;
    }

    public Short getCoberturadental() {
        return coberturadental;
    }

    public void setCoberturadental(Short coberturadental) {
        this.coberturadental = coberturadental;
    }

    public Short getCoberturafecundacioninvitro() {
        return coberturafecundacioninvitro;
    }

    public void setCoberturafecundacioninvitro(Short coberturafecundacioninvitro) {
        this.coberturafecundacioninvitro = coberturafecundacioninvitro;
    }

    public Short getEnfermedadcorazon() {
        return enfermedadcorazon;
    }

    public void setEnfermedadcorazon(Short enfermedadcorazon) {
        this.enfermedadcorazon = enfermedadcorazon;
    }

    public Short getEnfermedadestomacal() {
        return enfermedadestomacal;
    }

    public void setEnfermedadestomacal(Short enfermedadestomacal) {
        this.enfermedadestomacal = enfermedadestomacal;
    }

    public Short getEnfermedadrinyones() {
        return enfermedadrinyones;
    }

    public void setEnfermedadrinyones(Short enfermedadrinyones) {
        this.enfermedadrinyones = enfermedadrinyones;
    }

    public Short getEnfermedadalergia() {
        return enfermedadalergia;
    }

    public void setEnfermedadalergia(Short enfermedadalergia) {
        this.enfermedadalergia = enfermedadalergia;
    }

    public String getNombrealergia() {
        return nombrealergia;
    }

    public void setNombrealergia(String nombrealergia) {
        this.nombrealergia = nombrealergia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSeguroMedico != null ? idSeguroMedico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seguromedico)) {
            return false;
        }
        Seguromedico other = (Seguromedico) object;
        if ((this.idSeguroMedico == null && other.idSeguroMedico != null) || (this.idSeguroMedico != null && !this.idSeguroMedico.equals(other.idSeguroMedico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.diana.entidades.Seguromedico[ idSeguroMedico=" + idSeguroMedico + " ]";
    }
    
}
