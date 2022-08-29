package com.mislibros.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
class Editorial {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name  = "uuid", strategy = "uuid2")
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
