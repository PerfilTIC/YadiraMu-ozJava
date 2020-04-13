package co.app.product.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import co.app.product.genericRepository.GenericRepository;
import co.app.product.model.Product;
import co.app.product.repository.IProductRepository;
import co.app.product.service.ProductService;

/**
 * 
 *This is a class where the generic class of the product is linked with the service class
 * @author yadira muñoz herrera
 *
 */
@Transactional
@Service
public class ProductImpl extends GenericRepository<Product, Long> implements ProductService {

	@Autowired
	IProductRepository repository;
	
	@Override
	public CrudRepository<Product, Long> getRepo() {
		return repository;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findById(Long id) {

		return (List<Product>) repository;
	}
	
}
