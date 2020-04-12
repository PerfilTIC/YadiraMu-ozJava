package co.app.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import co.app.product.model.Category;

public interface ICategoryRepository extends CrudRepository<Category, Long>{
	
	@Query("SELECT c FROM Category c WHERE c.idCategory NOT IN (SELECT ca.category FROM Category ca WHERE ca.category!=null)")
	List<Category> showCategories();

}
