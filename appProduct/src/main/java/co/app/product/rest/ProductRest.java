package co.app.product.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.app.common.dto.CategoryDto;
import co.app.common.dto.GenericDto;
import co.app.common.dto.ProductDto;
import co.app.common.util.Constant;
import co.app.product.service.rest.CategoryCreate;
import co.app.product.service.rest.CategoryRead;
import co.app.product.service.rest.ProductCreate;
import co.app.product.service.rest.ProductRead;

@RestController
public class ProductRest {
	
	@Autowired
	ProductCreate create;
	
	@Autowired
	ProductRead getProduct;
	
	@Autowired
	CategoryCreate categoryCreate;
	
	@Autowired
	CategoryRead categoryRead;

	@PostMapping(Constant.APP_PRODUCT_CONTROLLER_CREATE_PRODUCT)
	public ProductDto createProduct(@RequestBody ProductDto request) {
		return create.createProduct(request);
	}
	
	@PostMapping(Constant.APP_PRODUCT_CONTROLLER_CREATE_CATEGORY)
	public CategoryDto createCategory(@RequestBody CategoryDto request) {
		return categoryCreate.createCategory(request);
	}
	
	@GetMapping(Constant.APP_PRODUCT_CONTROLLER_GET_ALL_PRODUCT)
	public GenericDto getAllProducts() {
		return getProduct.getAllProducts();
	}
	
	@GetMapping(Constant.APP_PRODUCT_CONTROLLER_GET_CATEGORY_AVAILABLE)
	public GenericDto getAllCategories() {
		return categoryRead.getAllCategories();
	}
}
