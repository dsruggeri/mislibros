
package com.mislibros.app.repositories;

import com.mislibros.app.models.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, String>{
    
    // buscar por nombre y/o apellido
    // buscar por whatsapp
   
    
}
