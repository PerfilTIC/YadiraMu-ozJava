package co.app.product.service.rest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.app.common.dto.CategoryDto;
import co.app.common.util.Constant;
import co.app.product.model.Category;
import co.app.product.service.CategoryService;
/**
 * This class already exposes the service and only works with DTO, this is for create categories
 * @author yadira muñoz herrera
 *
 */
@Service
public class CategoryCreate {
	
	@Autowired
	CategoryService categoryService;
	
	public CategoryDto createCategory(CategoryDto request) {
		
		ModelMapper mapper= new ModelMapper();
		Category entity = mapper.map(request, Category.class);
		categoryService.save(entity);
		request.setCodeResponse(Constant.RESPONSE_CODE_OK);
		request.setMessageResponse(Constant.MESSAGE_CATEGORY_CREATE_SUCCESFUL);
		
		return request;
		
	}

}
