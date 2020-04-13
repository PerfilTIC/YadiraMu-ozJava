package co.app.product.service;

import java.util.List;

import co.app.product.genericRepository.IGenericRepository;
import co.app.product.model.Category;
/** 
 *This class projects the methods that were implemented in the Generic repository class 
 *for the table Category
 * @author yadira muñoz herrera
 *
 */

public interface CategoryService extends IGenericRepository<Category, Long>  {

	public List<Category> showCategories();
}
