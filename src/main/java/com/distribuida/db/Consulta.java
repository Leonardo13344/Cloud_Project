package com.distribuida.db;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "consultas")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cons")
    private Integer id_cons;

    @Column(name = "concepto_cons")
    private String concepto_cons;

    @Column(name = "id_paciente_cons")
    private Integer id_paciente_cons;

    @Column(name = "id_medico_cons")
    private Integer id_medico_cons;

    @Column(name = "fecha_cons")
    private Date fecha_cons;

    @Column(name = "estado_cons")
    private Boolean estado_cons;

    public Integer getId_cons() {
        return id_cons;
    }

    public void setId_cons(Integer id_cons) {
        this.id_cons = id_cons;
    }

    public String getConcepto_cons() {
        return concepto_cons;
    }

    public void setConcepto_cons(String concepto_cons) {
        this.concepto_cons = concepto_cons;
    }

    public Integer getId_paciente_cons() {
        return id_paciente_cons;
    }

    public void setId_paciente_cons(Integer id_paciente_cons) {
        this.id_paciente_cons = id_paciente_cons;
    }

    public Integer getId_medico_cons() {
        return id_medico_cons;
    }

    public void setId_medico_cons(Integer id_medico_cons) {
        this.id_medico_cons = id_medico_cons;
    }

    public Date getFecha_cons() {
        return fecha_cons;
    }

    public void setFecha_cons(Date fecha_cons) {
        this.fecha_cons = fecha_cons;
    }

    public Boolean getEstado_cons() {
        return estado_cons;
    }

    public void setEstado_cons(Boolean estado_cons) {
        this.estado_cons = estado_cons;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "id_cons=" + id_cons +
                ", concepto_cons='" + concepto_cons + '\'' +
                ", id_paciente_cons=" + id_paciente_cons +
                ", id_medico_cons=" + id_medico_cons +
                ", fecha_cons=" + fecha_cons +
                ", estado_cons=" + estado_cons +
                '}';
    }
}
