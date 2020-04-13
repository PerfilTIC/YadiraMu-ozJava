package co.app.product.service.rest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.app.common.dto.GenericDto;
import co.app.common.dto.ProductDto;
import co.app.common.util.Constant;
import co.app.product.model.Product;
import co.app.product.service.CategoryService;
import co.app.product.service.ProductService;
/**
 * This class already exposes the service and only works with DTO, this is for create products
 * @author yadira muñoz herrera
 *
 */
@Service
public class ProductCreate {

	@Autowired
	CategoryService categoryService;

	@Autowired
	ProductService productService;
	
	public ProductDto createProduct(ProductDto request) {

		
		System.out.println(request.toString());
		ModelMapper mapper = new ModelMapper();
		Product entity = mapper.map(request, Product.class);

		System.out.println(entity.toString());
		productService.save(entity);
		
		request.setCodeResponse(Constant.RESPONSE_CODE_OK);
		request.setMessageResponse(Constant.MESSAGE_PRODUCT_CREATE_SUCCESFUL);

		return request;
	}
}
