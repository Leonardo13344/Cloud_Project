package com.distribuida.db;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "seguros_medicos")
public class SeguroMedico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_segmed")
    private Integer id_segmed;

    @Column(name = "nombre_segmed")
    private String nombre_segmed;

    @Column(name = "num_poliza_segmed")
    private String num_poliza_segmed;

    @Column(name = "compania_segmed")
    private String compania_segmed;

    @Column(name = "fecha_vence_segmed")
    private Date fecha_segmed;

    @Column(name = "tipo_segmed")
    private String tipo_segmed;

    @Column(name = "porc_cobert_segmed")
    private Integer porc_cobert_segmed;

    @Column(name = "id_paciente")
    private Integer id_paciente_segmed;

    @Column(name = "estado_segmed")
    private Boolean estado_segmed;

    public Integer getId_segmed() {
        return id_segmed;
    }

    public void setId_segmed(Integer id_segmed) {
        this.id_segmed = id_segmed;
    }

    public String getNombre_segmed() {
        return nombre_segmed;
    }

    public void setNombre_segmed(String nombre_segmed) {
        this.nombre_segmed = nombre_segmed;
    }

    public String getNum_poliza_segmed() {
        return num_poliza_segmed;
    }

    public void setNum_poliza_segmed(String num_poliza_segmed) {
        this.num_poliza_segmed = num_poliza_segmed;
    }

    public String getCompania_segmed() {
        return compania_segmed;
    }

    public void setCompania_segmed(String compania_segmed) {
        this.compania_segmed = compania_segmed;
    }

    public Date getFecha_segmed() {
        return fecha_segmed;
    }

    public void setFecha_segmed(Date fecha_segmed) {
        this.fecha_segmed = fecha_segmed;
    }

    public String getTipo_segmed() {
        return tipo_segmed;
    }

    public void setTipo_segmed(String tipo_segmed) {
        this.tipo_segmed = tipo_segmed;
    }

    public Integer getPorc_cobert_segmed() {
        return porc_cobert_segmed;
    }

    public void setPorc_cobert_segmed(Integer porc_cobert_segmed) {
        this.porc_cobert_segmed = porc_cobert_segmed;
    }

    public Integer getId_paciente_segmed() {
        return id_paciente_segmed;
    }

    public void setId_paciente_segmed(Integer id_paciente_segmed) {
        this.id_paciente_segmed = id_paciente_segmed;
    }

    public Boolean getEstado_segmed() {
        return estado_segmed;
    }

    public void setEstado_segmed(Boolean estado_segmed) {
        this.estado_segmed = estado_segmed;
    }

    @Override
    public String toString() {
        return "SeguroMedico{" +
                "id_segmed=" + id_segmed +
                ", nombre_segmed='" + nombre_segmed + '\'' +
                ", num_poliza_segmed='" + num_poliza_segmed + '\'' +
                ", compania_segmed='" + compania_segmed + '\'' +
                ", fecha_segmed=" + fecha_segmed +
                ", tipo_segmed='" + tipo_segmed + '\'' +
                ", porc_cobert_segmed=" + porc_cobert_segmed +
                ", id_paciente_segmed=" + id_paciente_segmed +
                ", estado_segmed=" + estado_segmed +
                '}';
    }
}
