
package com.mislibros.app.repositories;

import com.mislibros.app.models.Autor;
import com.mislibros.app.models.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, String>{
             
           
    // buscar autor por apellido
    @Query("SELECT a FROM Autor a WHERE a.apellido LIKE %:apellido%")
    public List<Autor> buscarPorApellido(@Param("apellido") String apellido);
    
    
}
