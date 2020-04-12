package co.app.user.repository;

import org.springframework.data.repository.CrudRepository;

import co.app.user.model.User;

public interface IUserRepository extends CrudRepository<User, Long>{

}
