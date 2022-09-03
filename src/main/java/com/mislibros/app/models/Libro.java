
package com.mislibros.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Libro {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name  = "uuid", strategy = "uuid2")
    private String idLibro;
    
    private String titulo;
    
    @ManyToOne
    private Autor Autor;
    
    @ManyToOne
    private Editorial editorial;
    
    
    private String comentario;
    private boolean prestado;
    private String urlImagen;

    public Libro() {
    }

    public Libro(String titulo, Autor Autor, Editorial editorial, String urlImagen, String comentario) {
        this.titulo = titulo;
        this.Autor = Autor;
        this.editorial = editorial;
        this.urlImagen = urlImagen;
        this.comentario = comentario;
        this.prestado = false;
    }

    public String getIdLibro() {
        return idLibro;
    }

//    public void setIdLibro(String idLibro) {
//        this.idLibro = idLibro;
//    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return Autor;
    }

    public void setAutor(Autor Autor) {
        this.Autor = Autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
    
    
       
}
