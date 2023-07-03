package com.distribuida.db;

import jakarta.persistence.*;

@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id_fact;

    @Column
    private String fecha_emision_fact;

    @Column
    private String paciente_fact;

    @Column
    private String descripcion_fact;

    @Column
    private String monto_fact;

    @Column
    private String metodo_pago_fact;

    @Column
    private Integer id_receta_fact;

    public Integer getId_fact() {
        return id_fact;
    }

    public void setId_fact(Integer id_fact) {
        this.id_fact = id_fact;
    }

    public String getFecha_emision_fact() {
        return fecha_emision_fact;
    }

    public void setFecha_emision_fact(String fecha_emision_fact) {
        this.fecha_emision_fact = fecha_emision_fact;
    }

    public String getPaciente_fact() {
        return paciente_fact;
    }

    public void setPaciente_fact(String paciente_fact) {
        this.paciente_fact = paciente_fact;
    }

    public String getDescripcion_fact() {
        return descripcion_fact;
    }

    public void setDescripcion_fact(String descripcion_fact) {
        this.descripcion_fact = descripcion_fact;
    }

    public String getMonto_fact() {
        return monto_fact;
    }

    public void setMonto_fact(String monto_fact) {
        this.monto_fact = monto_fact;
    }

    public String getMetodo_pago_fact() {
        return metodo_pago_fact;
    }

    public void setMetodo_pago_fact(String metodo_pago_fact) {
        this.metodo_pago_fact = metodo_pago_fact;
    }

    public Integer getId_receta_fact() {
        return id_receta_fact;
    }

    public void setId_receta_fact(Integer id_receta_fact) {
        this.id_receta_fact = id_receta_fact;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id_fact=" + id_fact +
                ", fecha_emision_fact='" + fecha_emision_fact + '\'' +
                ", paciente_fact='" + paciente_fact + '\'' +
                ", descripcion_fact='" + descripcion_fact + '\'' +
                ", monto_fact='" + monto_fact + '\'' +
                ", metodo_pago_fact='" + metodo_pago_fact + '\'' +
                ", id_receta_fact=" + id_receta_fact +
                '}';
    }
}
