package co.app.product.service.rest;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.app.common.dto.GenericDto;
import co.app.common.dto.ProductDto;
import co.app.common.util.Constant;
import co.app.product.service.ProductService;
/**
 * This class already exposes the service and only works with DTO, this is for 
 * read DTO from datatable
 * @author yadira muñoz herrera
 *
 */
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
	
	public ProductDto findById(Long id) {
		ProductDto response= new ProductDto();
		response.setIdProduct(id);
		response.setCodeResponse(Constant.RESPONSE_CODE_OK);
		response.setMessageResponse(Constant.MESSAGE_PRODUCT_GET_ALL_PRODUCT);	
		return response;
	}

}
