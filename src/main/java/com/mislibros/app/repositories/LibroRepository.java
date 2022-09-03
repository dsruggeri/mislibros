
package com.mislibros.app.repositories;

import com.mislibros.app.models.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, String>{
    
    // buscar libro por Autor
    @Query("SELECT l FROM Libro l WHERE l.autor.apellido LIKE %:apellido%")
    public List<Libro> buscarPorAutor(@Param("apellido") String apellido);
    
    // buscar libro por Editorial
    @Query("SELECT l FROM Libro l WHERE l.editorial.nombre LIKE %:nombre%")
    public List<Libro> buscarPorEditorial(@Param("nombre") String nombre);
    
    // buscar libro por Titulo
    @Query("SELECT l FROM Libro l WHERE l.titulo LIKE %:titulo%")
    public List<Libro> buscarPorTitulo(@Param("titulo") String titulo);
    
    // listar por PRESTADOS true
    @Query("SELECT l FROM Libro l WHERE l.prestado =  true")
    public List<Libro> listarPrestados();
    
}
