package co.app.product.repository;

import org.springframework.data.repository.CrudRepository;

import co.app.product.model.Product;


public interface IProductRepository extends CrudRepository<Product, Long>{

	
}
