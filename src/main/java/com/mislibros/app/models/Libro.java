
package com.mislibros.app.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Libro {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name  = "uuid", strategy = "uuid2")
    private String idLibro;
    
    private String titulo;
    private Autor Autor;
    private Editorial editorial;
    private List<String> comentario;
    private boolean prestado;
    private String urlImagen;

    public Libro() {
    }

    public Libro(String titulo, Autor Autor, Editorial editorial, String urlImagen) {
        this.titulo = titulo;
        this.Autor = Autor;
        this.editorial = editorial;
        this.urlImagen = urlImagen;
        this.comentario = new ArrayList<>();
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

    public List<String> getComentario() {
        return comentario;
    }

    public void setComentario(List<String> comentario) {
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
