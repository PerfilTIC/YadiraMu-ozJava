package co.app.product.repository;

import org.springframework.data.repository.CrudRepository;

import co.app.product.model.ShoppingCar;

/**
 * This is the class the methods used by the queries to the database that have to do with
 * the shopping cart are projected
 * @author yadira muñoz herrera
 *
 */
public interface IShoppingCarRepository extends CrudRepository<ShoppingCar, Long> {

}
