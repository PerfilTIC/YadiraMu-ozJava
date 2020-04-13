package co.app.user.service;


import java.util.List;

import co.app.user.genericRepository.IGenericRepository;
import co.app.user.model.User;

public interface UserService extends IGenericRepository<User, Long> {

	public List<User> authentic(String user, String password);
}
