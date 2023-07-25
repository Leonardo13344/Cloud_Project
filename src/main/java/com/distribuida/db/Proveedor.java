package com.distribuida.db;

import jakarta.persistence.*;

@Entity
@Table(name = "proveedores")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_proveedor")
    private Integer id_prov;

    @Column(name = "direccion_proveedor")
    private String direccion_prov;

    @Column(name = "telefono_proveedor")
    private String telefono_prov;

    @Column(name = "descuento_proveedor")
    private Integer descuento_prov;

    public Integer getId_prov() {
        return id_prov;
    }

    public void setId_prov(Integer id_prov) {
        this.id_prov = id_prov;
    }

    public String getDireccion_prov() {
        return direccion_prov;
    }

    public void setDireccion_prov(String direccion_prov) {
        this.direccion_prov = direccion_prov;
    }

    public String getTelefono_prov() {
        return telefono_prov;
    }

    public void setTelefono_prov(String telefono_prov) {
        this.telefono_prov = telefono_prov;
    }

    public Integer getDescuento_prov() {
        return descuento_prov;
    }

    public void setDescuento_prov(Integer descuento_prov) {
        this.descuento_prov = descuento_prov;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "id_prov=" + id_prov +
                ", direccion_prov='" + direccion_prov + '\'' +
                ", telefono_prov='" + telefono_prov + '\'' +
                ", descuento_prov=" + descuento_prov +
                '}';
    }
}
