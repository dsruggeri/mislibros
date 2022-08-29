
package com.mislibros.app.repositories;

import com.mislibros.app.models.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial, String>{
    
    //buscar por nombre
    
}
