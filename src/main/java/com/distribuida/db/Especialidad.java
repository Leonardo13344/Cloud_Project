package com.distribuida.db;

import jakarta.persistence.*;

@Entity
@Table(name = "especialidades")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_espe")
    private Integer id_espe;

    @Column(name = "encargado_espe")
    private String encargado_espe;

    @Column(name = "descripcion_espe")
    private String descripcion_espe;

    @Column(name = "id_departamento_espe")
    private Integer id_departamento_espe;

    @Column(name = "estado_espe")
    private Boolean estado_espe;

    public Integer getId_espe() {
        return id_espe;
    }

    public void setId_espe(Integer id_espe) {
        this.id_espe = id_espe;
    }

    public String getEncargado_espe() {
        return encargado_espe;
    }

    public void setEncargado_espe(String encargado_espe) {
        this.encargado_espe = encargado_espe;
    }

    public String getDescripcion_espe() {
        return descripcion_espe;
    }

    public void setDescripcion_espe(String descripcion_espe) {
        this.descripcion_espe = descripcion_espe;
    }

    public Integer getId_departamento_espe() {
        return id_departamento_espe;
    }

    public void setId_departamento_espe(Integer id_departamento_espe) {
        this.id_departamento_espe = id_departamento_espe;
    }

    public Boolean getEstado_espe() {
        return estado_espe;
    }

    public void setEstado_espe(Boolean estado_espe) {
        this.estado_espe = estado_espe;
    }

    @Override
    public String toString() {
        return "Especialidad{" +
                "id_espe=" + id_espe +
                ", encargado_espe='" + encargado_espe + '\'' +
                ", descripcion_espe='" + descripcion_espe + '\'' +
                ", id_departamento_espe=" + id_departamento_espe +
                ", estado_espe=" + estado_espe +
                '}';
    }
}
