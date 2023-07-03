package com.distribuida.db;

import jakarta.persistence.*;

@Entity
@Table(name = "medicinas")
public class Medicina {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id_medi;

    @Column
    private String componentes_medi;

    @Column
    private Boolean disponibilidad_medi;

    @Column
    private Integer cantidad_medi;

    @Column
    private Integer id_proveedor_medi;

    @Column
    private Integer id_receta_medi;

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

    @Override
    public String toString() {
        return "Medicina{" +
                "id_medi=" + id_medi +
                ", componentes_medi='" + componentes_medi + '\'' +
                ", disponibilidad_medi=" + disponibilidad_medi +
                ", cantidad_medi=" + cantidad_medi +
                ", id_proveedor_medi=" + id_proveedor_medi +
                ", id_receta_medi=" + id_receta_medi +
                '}';
    }
}
