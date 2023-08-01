package com.distribuida.db;

import jakarta.persistence.*;

@Entity
@Table(name = "departamentos")
public class Departamento {

    @Id()
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_depart")
    private Integer id_depa;

    @Column(name = "num_empl_depart")
    private Integer num_empl_depa;

    @Column(name = "encargado_id_depart")
    private String encargado_id_dep;

    @Column(name = "oficina_depart")
    private String oficina_depa;

    @Column(name = "estado_depart")
    private Boolean estado_depart;

    public Integer getId_depa() {
        return id_depa;
    }

    public void setId_depa(Integer id_depa) {
        this.id_depa = id_depa;
    }

    public Integer getNum_empl_depa() {
        return num_empl_depa;
    }

    public void setNum_empl_depa(Integer num_empl_depa) {
        this.num_empl_depa = num_empl_depa;
    }

    public String getEncargado_id_dep() {
        return encargado_id_dep;
    }

    public void setEncargado_id_dep(String encargado_id_dep) {
        this.encargado_id_dep = encargado_id_dep;
    }

    public String getOficina_depa() {
        return oficina_depa;
    }

    public void setOficina_depa(String oficina_depa) {
        this.oficina_depa = oficina_depa;
    }

    public Boolean getEstado_depart() {
        return estado_depart;
    }

    public void setEstado_depart(Boolean estado_depart) {
        this.estado_depart = estado_depart;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "id_depa=" + id_depa +
                ", num_empl_depa=" + num_empl_depa +
                ", encargado_id_dep='" + encargado_id_dep + '\'' +
                ", oficina_depa='" + oficina_depa + '\'' +
                ", estado_depart=" + estado_depart +
                '}';
    }
}
