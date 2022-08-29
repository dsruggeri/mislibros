
package com.mislibros.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Contacto {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name  = "uuid", strategy = "uuid2")
    private String idContacto;
    
    private String nombre;
    private String apelido;
    private String email;
    private String whatsapp;

    public Contacto() {
    }

    public Contacto(String nombre, String apelido, String email, String whatsapp) {
        this.nombre = nombre;
        this.apelido = apelido;
        this.email = email;
        this.whatsapp = whatsapp;
    }

    public String getIdContacto() {
        return idContacto;
    }

//    public void setIdContacto(String idContacto) {
//        this.idContacto = idContacto;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
    
    
    
    
}
