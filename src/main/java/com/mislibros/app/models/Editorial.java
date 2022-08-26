package com.mislibros.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class Editorial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idEditorial;

    private String nombre;

    public Editorial() {
    }

    public Editorial(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEditorial() {
        return idEditorial;
    }

//    public void setIdEditorial(String idEditorial) {
//        this.idEditorial = idEditorial;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

}
