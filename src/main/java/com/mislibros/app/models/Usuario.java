
package com.mislibros.app.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name  = "uuid", strategy = "uuid2")
    private String idUsuario;
    
    private String nombre;
    private String apellido;
    private String username;
    private String email;
    private String password;
    private String imagenPerfil;
    
    private List<Libro> biblioteca;
    
    private List<Contacto> agenda;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String username, String email, String password, String imagenPerfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.email = email;
        this.password = password;
        this.imagenPerfil = imagenPerfil;
        this.biblioteca = new ArrayList<>();
        this.agenda = new ArrayList<>();
    }

    public String getIdUsuario() {
        return idUsuario;
    }

//    public void setIdUsuario(String idUsuario) {
//        this.idUsuario = idUsuario;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(String imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    public List<Libro> getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(List<Libro> biblioteca) {
        this.biblioteca = biblioteca;
    }

    public List<Contacto> getAgenda() {
        return agenda;
    }

    public void setAgenda(List<Contacto> agenda) {
        this.agenda = agenda;
    }
    
    
    
    
    
    
}
