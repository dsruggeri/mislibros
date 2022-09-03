
package com.mislibros.app.repositories;

import com.mislibros.app.models.Editorial;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial, String>{
    
    //buscar editorial por nombre
    @Query("SELECT e FROM Editorial e WHERE e.nombre LIKE %:nombre%")
    public List<Editorial> buscarPorNombre(@Param("nombre") String nombre);
    
}
