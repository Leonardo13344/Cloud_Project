package com.distribuida.db;

import jakarta.persistence.*;

@Entity
@Table(name = "historiales")
public class Historial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_hist")
    private Integer id_hist;

    @Column(name = "id_consulta_hist")
    private Integer id_consulta_hist;

    @Column(name = "id_paciente_hist")
    private Integer id_paciente_hist;

    @Column(name = "estado_hist")
    private Boolean estado_hist;

    public Integer getId_hist() {
        return id_hist;
    }

    public void setId_hist(Integer id_hist) {
        this.id_hist = id_hist;
    }

    public Integer getId_consulta_hist() {
        return id_consulta_hist;
    }

    public void setId_consulta_hist(Integer id_consulta_hist) {
        this.id_consulta_hist = id_consulta_hist;
    }

    public Integer getId_paciente_hist() {
        return id_paciente_hist;
    }

    public void setId_paciente_hist(Integer id_paciente_hist) {
        this.id_paciente_hist = id_paciente_hist;
    }

    public Boolean getEstado_hist() {
        return estado_hist;
    }

    public void setEstado_hist(Boolean estado_hist) {
        this.estado_hist = estado_hist;
    }

    @Override
    public String toString() {
        return "Historial{" +
                "id_hist=" + id_hist +
                ", id_consulta_hist=" + id_consulta_hist +
                ", id_paciente_hist=" + id_paciente_hist +
                ", estado_hist=" + estado_hist +
                '}';
    }
}
