package com.distribuida.db;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "derivaciones")
public class Derivacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_deri")
    private Integer id_deri;

    @Column(name = "id_usuario_deri")
    private String id_usuario_deri;

    @Column(name = "descripcion_deri")
    private String descripcion_deri;

    @Column(name = "fecha_deri")
    private Date fecha_deri;

    @Column(name = "id_med_deri")
    private Integer id_med_deri;

    @Column(name = "estado_deri")
    private Boolean estado_deri;

    public Integer getId_deri() {
        return id_deri;
    }

    public void setId_deri(Integer id_deri) {
        this.id_deri = id_deri;
    }

    public String getId_usuario_deri() {
        return id_usuario_deri;
    }

    public void setId_usuario_deri(String id_usuario_deri) {
        this.id_usuario_deri = id_usuario_deri;
    }

    public String getDescripcion_deri() {
        return descripcion_deri;
    }

    public void setDescripcion_deri(String descripcion_deri) {
        this.descripcion_deri = descripcion_deri;
    }

    public Date getFecha_deri() {
        return fecha_deri;
    }

    public void setFecha_deri(Date fecha_deri) {
        this.fecha_deri = fecha_deri;
    }

    public Integer getId_med_deri() {
        return id_med_deri;
    }

    public void setId_med_deri(Integer id_med_deri) {
        this.id_med_deri = id_med_deri;
    }

    public Boolean getEstado_deri() {
        return estado_deri;
    }

    public void setEstado_deri(Boolean estado_deri) {
        this.estado_deri = estado_deri;
    }

    @Override
    public String toString() {
        return "Derivacion{" +
                "id_deri=" + id_deri +
                ", id_usuario_deri='" + id_usuario_deri + '\'' +
                ", descripcion_deri='" + descripcion_deri + '\'' +
                ", fecha_deri=" + fecha_deri +
                ", id_med_deri=" + id_med_deri +
                ", estado_deri=" + estado_deri +
                '}';
    }
}
