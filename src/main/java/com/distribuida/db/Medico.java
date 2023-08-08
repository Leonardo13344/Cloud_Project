package com.distribuida.db;

import jakarta.persistence.*;

@Entity
@Table(name = "medicos")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_medi")
    private Integer id_medi;

    @Column(name = "nombre_medi")
    private String nombre_medi;

    @Column(name = "id_especialidad_medi")
    private Integer id_especialidad_medi;

    @Column(name = "hospital_medi")
    private String hospital_medi;

    @Column(name = "direccion_medi")
    private String direccion_medi;

    @Column(name = "apellidos_medi")
    private String apellidos_medi;

    @Column(name = "correo_medi")
    private String correo_medi;

    @Column(name = "salario_medi")
    private Double salario_medi;

    @Column(name = "supervisor_id_medi")
    private Integer supervisor_id_medi;

    @Column(name = "estado_medi")
    private Boolean estado_medi;

    public Integer getId_medi() {
        return id_medi;
    }

    public void setId_medi(Integer id_medi) {
        this.id_medi = id_medi;
    }

    public String getNombre_medi() {
        return nombre_medi;
    }

    public void setNombre_medi(String nombre_medi) {
        this.nombre_medi = nombre_medi;
    }

    public Integer getId_especialidad_medi() {
        return id_especialidad_medi;
    }

    public void setId_especialidad_medi(Integer id_especialidad_medi) {
        this.id_especialidad_medi = id_especialidad_medi;
    }

    public String getHospital_medi() {
        return hospital_medi;
    }

    public void setHospital_medi(String hospital_medi) {
        this.hospital_medi = hospital_medi;
    }

    public String getDireccion_medi() {
        return direccion_medi;
    }

    public void setDireccion_medi(String direccion_medi) {
        this.direccion_medi = direccion_medi;
    }

    public String getApellidos_medi() {
        return apellidos_medi;
    }

    public void setApellidos_medi(String apellidos_medi) {
        this.apellidos_medi = apellidos_medi;
    }

    public String getCorreo_medi() {
        return correo_medi;
    }

    public void setCorreo_medi(String correo_medi) {
        this.correo_medi = correo_medi;
    }

    public Double getSalario_medi() {
        return salario_medi;
    }

    public void setSalario_medi(Double salario_medi) {
        this.salario_medi = salario_medi;
    }

    public Integer getSupervisor_id_medi() {
        return supervisor_id_medi;
    }

    public void setSupervisor_id_medi(Integer supervisor_id_medi) {
        this.supervisor_id_medi = supervisor_id_medi;
    }

    public Boolean getEstado_medi() {
        return estado_medi;
    }

    public void setEstado_medi(Boolean estado_medi) {
        this.estado_medi = estado_medi;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id_medi=" + id_medi +
                ", nombre_medi='" + nombre_medi + '\'' +
                ", id_especialidad_medi=" + id_especialidad_medi +
                ", hospital_medi='" + hospital_medi + '\'' +
                ", direccion_medi='" + direccion_medi + '\'' +
                ", apellidos_medi='" + apellidos_medi + '\'' +
                ", correo_medi='" + correo_medi + '\'' +
                ", salario_medi=" + salario_medi +
                ", supervisor_id_medi=" + supervisor_id_medi +
                ", estado_medi=" + estado_medi +
                '}';
    }
}
