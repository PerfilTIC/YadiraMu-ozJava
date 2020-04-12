package co.app.product.service;

import java.util.List;

import co.app.product.genericRepository.IGenericRepository;
import co.app.product.model.Category;


public interface CategoryService extends IGenericRepository<Category, Long>  {

	public List<Category> showCategories();
}
