package com.distribuida.db;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_pac;

    @Column(name = "cedula_pac")
    private String cedula_pac;

    @Column(name = "nombre_pac")
    private String nombre_pac;

    @Column(name = "apellido_paterno_pac")
    private String apellido_paterno_pac;

    @Column(name = "apellido_materno_pac")
    private String apellido_materno_pac;

    @Column(name = "sexo_pac")
    private Integer sexo_pac;

    @Column(name = "fecha_nac_pac")
    private Date fecha_nac_pac;

    @Column(name = "domicilio_pac")
    private String domicilio_pac;

    @Column(name = "telefono_pac")
    private String telefono_pac;

    @Column(name = "num_expediente_pac")
    private String num_expediente_pac;

    @Column(name = "id_hospitalario_pac")
    private String id_hospitalario_pac;

    @Column(name = "estado_pac")
    private Boolean estado_pac;

    public Integer getId_pac() {
        return id_pac;
    }

    public void setId_pac(Integer id_pac) {
        this.id_pac = id_pac;
    }

    public String getCedula_pac() {
        return cedula_pac;
    }

    public void setCedula_pac(String cedula_pac) {
        this.cedula_pac = cedula_pac;
    }

    public String getNombre_pac() {
        return nombre_pac;
    }

    public void setNombre_pac(String nombre_pac) {
        this.nombre_pac = nombre_pac;
    }

    public String getApellido_paterno_pac() {
        return apellido_paterno_pac;
    }

    public void setApellido_paterno_pac(String apellido_paterno_pac) {
        this.apellido_paterno_pac = apellido_paterno_pac;
    }

    public String getApellido_materno_pac() {
        return apellido_materno_pac;
    }

    public void setApellido_materno_pac(String apellido_materno_pac) {
        this.apellido_materno_pac = apellido_materno_pac;
    }

    public Integer getSexo_pac() {
        return sexo_pac;
    }

    public void setSexo_pac(Integer sexo_pac) {
        this.sexo_pac = sexo_pac;
    }

    public Date getFecha_nac_pac() {
        return fecha_nac_pac;
    }

    public void setFecha_nac_pac(Date fecha_nac_pac) {
        this.fecha_nac_pac = fecha_nac_pac;
    }

    public String getDomicilio_pac() {
        return domicilio_pac;
    }

    public void setDomicilio_pac(String domicilio_pac) {
        this.domicilio_pac = domicilio_pac;
    }

    public String getTelefono_pac() {
        return telefono_pac;
    }

    public void setTelefono_pac(String telefono_pac) {
        this.telefono_pac = telefono_pac;
    }

    public String getNum_expediente_pac() {
        return num_expediente_pac;
    }

    public void setNum_expediente_pac(String num_expediente_pac) {
        this.num_expediente_pac = num_expediente_pac;
    }

    public String getId_hospitalario_pac() {
        return id_hospitalario_pac;
    }

    public void setId_hospitalario_pac(String id_hospitalario_pac) {
        this.id_hospitalario_pac = id_hospitalario_pac;
    }

    public Boolean getEstado_pac() {
        return estado_pac;
    }

    public void setEstado_pac(Boolean estado_pac) {
        this.estado_pac = estado_pac;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id_pac=" + id_pac +
                ", cedula_pac='" + cedula_pac + '\'' +
                ", nombre_pac='" + nombre_pac + '\'' +
                ", apellido_paterno_pac='" + apellido_paterno_pac + '\'' +
                ", apellido_materno_pac='" + apellido_materno_pac + '\'' +
                ", sexo_pac=" + sexo_pac +
                ", fecha_nac_pac=" + fecha_nac_pac +
                ", domicilio_pac='" + domicilio_pac + '\'' +
                ", telefono_pac='" + telefono_pac + '\'' +
                ", num_expediente_pac='" + num_expediente_pac + '\'' +
                ", id_hospitalario_pac='" + id_hospitalario_pac + '\'' +
                ", estado_pac=" + estado_pac +
                '}';
    }
}
