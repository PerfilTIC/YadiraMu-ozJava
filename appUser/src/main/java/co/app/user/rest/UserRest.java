package co.app.user.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.app.common.dto.UserDto;
import co.app.common.util.Constant;
import co.app.user.service.rest.UserRead;
/**
 * This is the class of Restcontrollers, which are in charge of managing the information and converting or receiving 
 * it in the form of a DTO
 * @author yadira muñoz herrera
 *
 */
@RestController
public class UserRest {

	@Autowired
	UserRead userRead;
	
	@PostMapping(Constant.APP_PRODUCT_CONTROLLER_LOGIN)
	public UserDto auth(@RequestBody UserDto request) {		
		return userRead.auth(request);
	}
}
