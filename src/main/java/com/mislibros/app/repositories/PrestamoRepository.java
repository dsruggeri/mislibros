
package com.mislibros.app.repositories;

import com.mislibros.app.models.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {
    
    // buscar por Libro
    // buscar por Autor
    // buscar por Editorial
    // buscar por fecha
    // buscar por estado
    // buscar por Contacto
    
}
