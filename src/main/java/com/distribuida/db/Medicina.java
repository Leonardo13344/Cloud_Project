package com.distribuida.db;

import jakarta.persistence.*;

@Entity
@Table(name = "medicinas")
public class Medicina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_medi")
    private Integer id_medi;

    @Column(name = "componentes_medi")
    private String componentes_medi;

    @Column(name = "disponibilidad_medi")
    private Boolean disponibilidad_medi;

    @Column(name = "cantidad_medi")
    private Integer cantidad_medi;

    @Column(name = "id_proveedor_medi")
    private Integer id_proveedor_medi;

    @Column(name = "id_receta_medi")
    private Integer id_receta_medi;

    @Column(name = "estado_medi")
    private Boolean estado_medi;

    public Integer getId_medi() {
        return id_medi;
    }

    public void setId_medi(Integer id_medi) {
        this.id_medi = id_medi;
    }

    public String getComponentes_medi() {
        return componentes_medi;
    }

    public void setComponentes_medi(String componentes_medi) {
        this.componentes_medi = componentes_medi;
    }

    public Boolean getDisponibilidad_medi() {
        return disponibilidad_medi;
    }

    public void setDisponibilidad_medi(Boolean disponibilidad_medi) {
        this.disponibilidad_medi = disponibilidad_medi;
    }

    public Integer getCantidad_medi() {
        return cantidad_medi;
    }

    public void setCantidad_medi(Integer cantidad_medi) {
        this.cantidad_medi = cantidad_medi;
    }

    public Integer getId_proveedor_medi() {
        return id_proveedor_medi;
    }

    public void setId_proveedor_medi(Integer id_proveedor_medi) {
        this.id_proveedor_medi = id_proveedor_medi;
    }

    public Integer getId_receta_medi() {
        return id_receta_medi;
    }

    public void setId_receta_medi(Integer id_receta_medi) {
        this.id_receta_medi = id_receta_medi;
    }

    public Boolean getEstado_medi() {
        return estado_medi;
    }

    public void setEstado_medi(Boolean estado_medi) {
        this.estado_medi = estado_medi;
    }

    @Override
    public String toString() {
        return "Medicina{" +
                "id_medi=" + id_medi +
                ", componentes_medi='" + componentes_medi + '\'' +
                ", disponibilidad_medi=" + disponibilidad_medi +
                ", cantidad_medi=" + cantidad_medi +
                ", id_proveedor_medi=" + id_proveedor_medi +
                ", id_receta_medi=" + id_receta_medi +
                ", estado_medi=" + estado_medi +
                '}';
    }
}
