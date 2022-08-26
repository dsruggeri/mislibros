package com.mislibros.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idAutor;
    
    private String nombre;
    private String apellido;

    public Autor() {
    }

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getIdAutor() {
        return idAutor;
    }

//    public void setIdAutor(String idAutor) {
//        this.idAutor = idAutor;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    

}
