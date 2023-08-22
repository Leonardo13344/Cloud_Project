package com.distribuida.db;

import jakarta.persistence.*;

@Entity
@Table(name = "personal")
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pers")
    private Integer id_pers;

    @Column(name = "id_departamento_pers")
    private Integer id_departamento_pers;

    @Column(name = "encargado_pers")
    private String encargado_pers;

    @Column(name = "horario_pers")
    private String horario_pers;

    @Column(name = "estado_pers")
    private Boolean estado_pers;

    public Integer getId_pers() {
        return id_pers;
    }

    public void setId_pers(Integer id_pers) {
        this.id_pers = id_pers;
    }

    public Integer getId_departamento_pers() {
        return id_departamento_pers;
    }

    public void setId_departamento_pers(Integer id_departamento_pers) {
        this.id_departamento_pers = id_departamento_pers;
    }

    public String getEncargado_pers() {
        return encargado_pers;
    }

    public void setEncargado_pers(String encargado_pers) {
        this.encargado_pers = encargado_pers;
    }

    public String getHorario_pers() {
        return horario_pers;
    }

    public void setHorario_pers(String horario_pers) {
        this.horario_pers = horario_pers;
    }

    public Boolean getEstado_pers() {
        return estado_pers;
    }

    public void setEstado_pers(Boolean estado_pers) {
        this.estado_pers = estado_pers;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "id_pers=" + id_pers +
                ", id_departamento_pers=" + id_departamento_pers +
                ", encargado_pers='" + encargado_pers + '\'' +
                ", horario_pers='" + horario_pers + '\'' +
                ", estado_pers=" + estado_pers +
                '}';
    }
}
