package com.ProyectoFinal.Upiiz.Models;

public class ModelAuth {
    private String email;
    private Integer id;
    private String password;

    public ModelAuth(String email, Integer id, String password) {
        this.email = email;
        this.id = id;
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public ModelAuth(){

    }
}
