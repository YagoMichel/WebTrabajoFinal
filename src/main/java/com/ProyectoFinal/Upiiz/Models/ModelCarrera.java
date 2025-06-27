package com.ProyectoFinal.Upiiz.Models;

public class ModelCarrera {
    private String nombre;
    private String observaciones;
    private Integer id;
    private Integer semestres;

    public ModelCarrera(String nombre, String observaciones, Integer id, Integer semestres) {
        this.nombre = nombre;
        this.observaciones = observaciones;
        this.id = id;
        this.semestres = semestres;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getSemestres() {
        return semestres;
    }
    public void setSemestres(Integer semestres) {
        this.semestres = semestres;
    }
    public ModelCarrera(){

    }

}
