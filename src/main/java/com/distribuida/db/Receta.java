package com.distribuida.db;

import jakarta.persistence.*;

@Entity
@Table(name = "recetas")
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_rece")
    private Integer id_rece;

    @Column(name = "duracionD_rece")
    private Integer duracionD_rece;

    @Column(name = "duracionM_rece")
    private Integer duracionM_rece;

    @Column(name = "duracionA_rece")
    private Integer duracionA_rece;

    @Column(name = "comentarios_rece")
    private String comentarios_rece;

    @Column(name = "motivos_rece")
    private String motivos_rece;

    @Column(name = "via_administracion_rece")
    private String via_administracion_rece;

    @Column(name = "id_consulta_rece")
    private Integer id_consulta_rece;

    @Column(name = "estado_rece")
    private Boolean estado_rece;

    public Integer getId_rece() {
        return id_rece;
    }

    public void setId_rece(Integer id_rece) {
        this.id_rece = id_rece;
    }

    public Integer getDuracionD_rece() {
        return duracionD_rece;
    }

    public void setDuracionD_rece(Integer duracionD_rece) {
        this.duracionD_rece = duracionD_rece;
    }

    public Integer getDuracionM_rece() {
        return duracionM_rece;
    }

    public void setDuracionM_rece(Integer duracionM_rece) {
        this.duracionM_rece = duracionM_rece;
    }

    public Integer getDuracionA_rece() {
        return duracionA_rece;
    }

    public void setDuracionA_rece(Integer duracionA_rece) {
        this.duracionA_rece = duracionA_rece;
    }

    public String getComentarios_rece() {
        return comentarios_rece;
    }

    public void setComentarios_rece(String comentarios_rece) {
        this.comentarios_rece = comentarios_rece;
    }

    public String getMotivos_rece() {
        return motivos_rece;
    }

    public void setMotivos_rece(String motivos_rece) {
        this.motivos_rece = motivos_rece;
    }

    public String getVia_administracion_rece() {
        return via_administracion_rece;
    }

    public void setVia_administracion_rece(String via_administracion_rece) {
        this.via_administracion_rece = via_administracion_rece;
    }

    public Integer getId_consulta_rece() {
        return id_consulta_rece;
    }

    public void setId_consulta_rece(Integer id_consulta_rece) {
        this.id_consulta_rece = id_consulta_rece;
    }

    public Boolean getEstado_rece() {
        return estado_rece;
    }

    public void setEstado_rece(Boolean estado_rece) {
        this.estado_rece = estado_rece;
    }

    @Override
    public String toString() {
        return "Receta{" +
                "id_rece=" + id_rece +
                ", duracionD_rece=" + duracionD_rece +
                ", duracionM_rece=" + duracionM_rece +
                ", duracionA_rece=" + duracionA_rece +
                ", comentarios_rece='" + comentarios_rece + '\'' +
                ", motivos_rece='" + motivos_rece + '\'' +
                ", via_administracion_rece='" + via_administracion_rece + '\'' +
                ", id_consulta_rece=" + id_consulta_rece +
                ", estado_rece=" + estado_rece +
                '}';
    }
}
