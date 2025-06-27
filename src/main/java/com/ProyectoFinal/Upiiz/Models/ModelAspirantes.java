package com.ProyectoFinal.Upiiz.Models;

public class ModelAspirantes {
    private String nombre;
    private String email;
    private String telefono;
    private Integer id;
    private Integer id_carrera;

    public ModelAspirantes(String nombre, String email, String telefono, Integer id, Integer id_carrera) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.id = id;
        this.id_carrera = id_carrera;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getCarrera() {
        return id_carrera;
    }
    public void setCarrera(Integer id_carrera) {
        this.id_carrera = id_carrera;
    }
    public ModelAspirantes(){

    }
}
