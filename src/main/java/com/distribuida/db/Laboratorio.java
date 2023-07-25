package com.distribuida.db;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "laboratorios")
public class Laboratorio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_laboratorio")
    private Integer id_labo;

    @Column(name = "nombre_pac_lab")
    private String nombre_pac_labo;

    @Column(name = "med_solicitante_lab")
    private String med_solicitante_labo;

    @Column(name = "fecha_lab")
    private Date fecha_labo;

    @Column(name = "tipo_prueba_lab")
    private String tipo_prueba_labo;

    @Column(name = "observaciones_lab")
    private String observaciones_labo;

    @Column(name = "encargado_lab")
    private Integer id_personal_labo;

    public Integer getId_labo() {
        return id_labo;
    }

    public void setId_labo(Integer id_labo) {
        this.id_labo = id_labo;
    }

    public String getNombre_pac_labo() {
        return nombre_pac_labo;
    }

    public void setNombre_pac_labo(String nombre_pac_labo) {
        this.nombre_pac_labo = nombre_pac_labo;
    }

    public String getMed_solicitante_labo() {
        return med_solicitante_labo;
    }

    public void setMed_solicitante_labo(String med_solicitante_labo) {
        this.med_solicitante_labo = med_solicitante_labo;
    }

    public Date getFecha_labo() {
        return fecha_labo;
    }

    public void setFecha_labo(Date fecha_labo) {
        this.fecha_labo = fecha_labo;
    }

    public String getTipo_prueba_labo() {
        return tipo_prueba_labo;
    }

    public void setTipo_prueba_labo(String tipo_prueba_labo) {
        this.tipo_prueba_labo = tipo_prueba_labo;
    }

    public String getObservaciones_labo() {
        return observaciones_labo;
    }

    public void setObservaciones_labo(String observaciones_labo) {
        this.observaciones_labo = observaciones_labo;
    }

    public Integer getId_personal_labo() {
        return id_personal_labo;
    }

    public void setId_personal_labo(Integer id_personal_labo) {
        this.id_personal_labo = id_personal_labo;
    }

    @Override
    public String toString() {
        return "Laboratorio{" +
                "id_labo=" + id_labo +
                ", nombre_pac_labo='" + nombre_pac_labo + '\'' +
                ", med_solicitante_labo='" + med_solicitante_labo + '\'' +
                ", fecha_labo=" + fecha_labo +
                ", tipo_prueba_labo='" + tipo_prueba_labo + '\'' +
                ", observaciones_labo='" + observaciones_labo + '\'' +
                ", id_personal_labo=" + id_personal_labo +
                '}';
    }
}
