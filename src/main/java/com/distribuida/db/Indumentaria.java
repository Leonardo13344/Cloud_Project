package com.distribuida.db;

import jakarta.persistence.*;

@Entity
@Table(name = "indumentarias")
public class Indumentaria {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id_indu;

    @Column
    private String concepto_indu;

    @Column
    private String ubicacion_indu;

    @Column
    private String area_indu;

    @Column
    private String id_laboratorio_indu;

    public Integer getId_indu() {
        return id_indu;
    }

    public void setId_indu(Integer id_indu) {
        this.id_indu = id_indu;
    }

    public String getConcepto_indu() {
        return concepto_indu;
    }

    public void setConcepto_indu(String concepto_indu) {
        this.concepto_indu = concepto_indu;
    }

    public String getUbicacion_indu() {
        return ubicacion_indu;
    }

    public void setUbicacion_indu(String ubicacion_indu) {
        this.ubicacion_indu = ubicacion_indu;
    }

    public String getArea_indu() {
        return area_indu;
    }

    public void setArea_indu(String area_indu) {
        this.area_indu = area_indu;
    }

    public String getId_laboratorio_indu() {
        return id_laboratorio_indu;
    }

    public void setId_laboratorio_indu(String id_laboratorio_indu) {
        this.id_laboratorio_indu = id_laboratorio_indu;
    }

    @Override
    public String toString() {
        return "Indumentaria{" +
                "id_indu=" + id_indu +
                ", concepto_indu='" + concepto_indu + '\'' +
                ", ubicacion_indu='" + ubicacion_indu + '\'' +
                ", area_indu='" + area_indu + '\'' +
                ", id_laboratorio_indu='" + id_laboratorio_indu + '\'' +
                '}';
    }
}
