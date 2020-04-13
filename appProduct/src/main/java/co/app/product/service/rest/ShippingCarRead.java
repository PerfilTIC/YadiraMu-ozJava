package co.app.product.service.rest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.app.common.dto.GenericDto;
import co.app.common.util.Constant;
import co.app.product.service.ShoppingCarService;

@Service
public class ShippingCarRead {

	@Autowired
	ShoppingCarService shopCarService;
	
	public GenericDto ShoppingCarGetAll() {
		
		GenericDto response= new GenericDto();
		response.setListObjects(new ArrayList<>(shopCarService.getAll()));
		response.setCodeResponse(Constant.RESPONSE_CODE_OK);
		response.setMessageResponse(Constant.MESSAGE_SHIPPING_GET_ALL);
		return response;
	}
}
