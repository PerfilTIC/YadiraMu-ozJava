package co.app.product.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import co.app.product.model.Product;

/**
 * This is the class the methods used by the queries to the database that have to 
 * do with a product searched by id are projected
 * @author yadira muñoz herrera
 *
 */

public interface IProductRepository extends CrudRepository<Product, Long>{

	@Query("SELECT u FROM Product u WHERE u.idCategory= :id")
	Optional<Product> findById(@Param("id") Long id);
}
