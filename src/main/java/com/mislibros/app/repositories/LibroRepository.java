
package com.mislibros.app.repositories;

import com.mislibros.app.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, String>{
    
    // buscar por Autor
    // buscar por Editorial
    // buscar por Titulo
    // listar por Estado
    
}
