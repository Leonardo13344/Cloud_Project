package com.distribuida.db;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "hospitalizaciones")
public class Hospitalizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id_hosp;

    @Column
    private Date fecha_inic_hosp;

    @Column
    private Date fecha_fin_hosp;

    @Column
    private Integer personal_encarg_hosp;

    @Column
    private String descripcion_hosp;

    public Integer getId_hosp() {
        return id_hosp;
    }

    public void setId_hosp(Integer id_hosp) {
        this.id_hosp = id_hosp;
    }

    public Date getFecha_inic_hosp() {
        return fecha_inic_hosp;
    }

    public void setFecha_inic_hosp(Date fecha_inic_hosp) {
        this.fecha_inic_hosp = fecha_inic_hosp;
    }

    public Date getFecha_fin_hosp() {
        return fecha_fin_hosp;
    }

    public void setFecha_fin_hosp(Date fecha_fin_hosp) {
        this.fecha_fin_hosp = fecha_fin_hosp;
    }

    public Integer getPersonal_encarg_hosp() {
        return personal_encarg_hosp;
    }

    public void setPersonal_encarg_hosp(Integer personal_encarg_hosp) {
        this.personal_encarg_hosp = personal_encarg_hosp;
    }

    public String getDescripcion_hosp() {
        return descripcion_hosp;
    }

    public void setDescripcion_hosp(String descripcion_hosp) {
        this.descripcion_hosp = descripcion_hosp;
    }

    @Override
    public String toString() {
        return "Hospitalizacion{" +
                "id_hosp=" + id_hosp +
                ", fecha_inic_hosp=" + fecha_inic_hosp +
                ", fecha_fin_hosp=" + fecha_fin_hosp +
                ", personal_encarg_hosp=" + personal_encarg_hosp +
                ", descripcion_hosp='" + descripcion_hosp + '\'' +
                '}';
    }
}