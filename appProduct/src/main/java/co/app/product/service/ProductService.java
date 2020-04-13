package co.app.product.service;

import java.util.List;

import co.app.product.genericRepository.IGenericRepository;
import co.app.product.model.Product;
/**
 * 
 *This class projects the methods that were implemented in the Generic repository class
 *for the table Product
 * @author yadira muñoz herrera
 *
 */
public interface ProductService extends IGenericRepository<Product, Long> {
	
	public List<Product> findById(Long id);
	
	

}
