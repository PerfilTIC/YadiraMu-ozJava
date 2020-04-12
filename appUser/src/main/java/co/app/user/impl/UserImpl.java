package co.app.user.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import co.app.user.genericRepository.GenericRepository;
import co.app.user.model.User;
import co.app.user.repository.IUserRepository;
import co.app.user.service.UserService;

@Transactional
@Service
public class UserImpl extends GenericRepository<User, Long> implements UserService{

	@Autowired
	IUserRepository userRepository;
	
	@Override
	public CrudRepository<User, Long> getRepo() {
	
		return userRepository;
	}

}
