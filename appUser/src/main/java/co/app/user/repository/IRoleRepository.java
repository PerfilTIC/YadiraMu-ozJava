package co.app.user.repository;

import org.springframework.data.repository.CrudRepository;

import co.app.user.model.Role;
/**
* 
*This is the class, the methods used by the queries to the database 
* @author yadira muñoz herrera
*
*/
public interface IRoleRepository extends CrudRepository<Role, Long>{

}
