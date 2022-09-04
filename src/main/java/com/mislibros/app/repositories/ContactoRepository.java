
package com.mislibros.app.repositories;

import com.mislibros.app.models.Contacto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, String>{
    
    // buscar por nombre y/o apellido y/o mail y/o whatsapp
    @Query("SELECT c FROM Contacto c WHERE c.nombre OR contacto.apellido "
            + " OR contacto.whatsapp OR contacto.email LIKE %:busqueda%")
    public List<Contacto> buscarPorAutor(@Param("busqueda") String busqueda);

   
    
}
