package co.app.product.service.rest;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.app.common.dto.GenericDto;
import co.app.common.util.Constant;
import co.app.product.service.ProductService;

@Service
public class ProductRead {
	
	@Autowired
	ProductService productService;
	
	public GenericDto getAllProducts() {
		
		GenericDto response=new GenericDto();
		response.setListObjects(new ArrayList<>(productService.getAll()));
		response.setCodeResponse(Constant.RESPONSE_CODE_OK);
		response.setMessageResponse(Constant.MESSAGE_PRODUCT_GET_ALL_PRODUCT);		
		return response;
		
	}

}
