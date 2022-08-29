
package com.mislibros.app.repositories;

import com.mislibros.app.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, String>{
    
    // buscar por nombre y/o apellido
    // buscar por apellido
    
    
}
