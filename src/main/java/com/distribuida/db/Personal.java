package com.distribuida.db;

import jakarta.persistence.*;

@Entity
@Table(name = "personal")
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id_pers;

    @Column
    private Integer id_departamento_pers;

    @Column
    private String encargado_pers;

    @Column
    private String horario_pers;

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

    @Override
    public String toString() {
        return "Personal{" +
                "id_pers=" + id_pers +
                ", id_departamento_pers=" + id_departamento_pers +
                ", encargado_pers='" + encargado_pers + '\'' +
                ", horario_pers='" + horario_pers + '\'' +
                '}';
    }
}
