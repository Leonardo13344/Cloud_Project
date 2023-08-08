package com.distribuida.db;

import jakarta.persistence.*;

@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_fact")
    private Integer id_fact;

    @Column(name = "fecha_emision_fact")
    private String fecha_emision_fact;

    @Column(name = "paciente_fact")
    private String paciente_fact;

    @Column(name = "descripcion_fact")
    private String descripcion_fact;

    @Column(name = "monto_fact")
    private String monto_fact;

    @Column(name = "metodo_pago_fact")
    private String metodo_pago_fact;

    @Column(name = "id_receta_fact")
    private Integer id_receta_fact;

    @Column(name = "estado_fact")
    private Boolean estado_fact;

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

    public Boolean getEstado_fact() {
        return estado_fact;
    }

    public void setEstado_fact(Boolean estado_fact) {
        this.estado_fact = estado_fact;
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
                ", estado_fact=" + estado_fact +
                '}';
    }
}
