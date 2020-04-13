package co.app.user.service;


import java.util.List;

import co.app.user.genericRepository.IGenericRepository;
import co.app.user.model.User;
/** 
 *This class projects the methods that were implemented in the Generic repository class 
 *for the table User
 * @author yadira muñoz herrera
 *
 */

public interface UserService extends IGenericRepository<User, Long> {

	public List<User> authentic(String user, String password);
}
