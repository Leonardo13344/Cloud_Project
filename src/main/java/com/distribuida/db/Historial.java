package com.distribuida.db;

import jakarta.persistence.*;

@Entity
@Table(name = "historiales")
public class Historial {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_historial")
    private Integer id_hist;

    @Column(name = "id_consulta")
    private Integer id_consulta_hist;

    @Column(name = "id_paciente")
    private Integer id_paciente_hist;

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

    @Override
    public String toString() {
        return "Historial{" +
                "id_hist=" + id_hist +
                ", id_consulta_hist=" + id_consulta_hist +
                ", id_paciente_hist=" + id_paciente_hist +
                '}';
    }
}
