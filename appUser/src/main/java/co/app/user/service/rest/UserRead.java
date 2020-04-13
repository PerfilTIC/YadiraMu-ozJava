package co.app.user.service.rest;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.app.common.dto.UserDto;
import co.app.common.util.Constant;

import co.app.user.model.User;
import co.app.user.service.UserService;
/** 
 *This class projects the methods that were implemented in the Generic repository class 
 *for the table User
 * @author yadira muñoz herrera
 *
 */


@Service
public class UserRead {

	@Autowired
	UserService userService;

	public UserDto auth(UserDto user) {

		UserDto response = new UserDto();

		List<User> userAuth = userService.authentic(user.getUsername(), user.getPassword());
		if (userAuth.size() > 0) {
			ModelMapper mapper = new ModelMapper();
			UserDto entity = mapper.map(userAuth.get(0), UserDto.class);
			response=entity;
			response.setCodeResponse(Constant.RESPONSE_CODE_OK);
			response.setMessageResponse(Constant.MESSAGE_LOGIN_SUCCESFUL);
		} else {
			response.setCodeResponse(Constant.RESPONSE_CODE_BAD);
			response.setMessageResponse(Constant.MESSAGE_LOGIN_ERROR);
		}
		return response;
	}

}
