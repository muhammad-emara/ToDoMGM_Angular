/**
 * 
 */
package com.emara.emaratodoServ.repositories;

/**
 * @author ME
 *
 */
import com.emara.emaratodoServ.models.Todo;

import org.springframework.stereotype.Repository;
//import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;




@Repository
public interface TodoRepository extends JpaRepository<Todo, String> {

}
