package co.app.user.repository;

import org.springframework.data.repository.CrudRepository;

import co.app.user.model.Role;

public interface IRoleRepository extends CrudRepository<Role, Long>{

}
