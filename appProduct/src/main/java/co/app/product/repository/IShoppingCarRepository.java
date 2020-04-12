package co.app.product.repository;

import org.springframework.data.repository.CrudRepository;

import co.app.product.model.ShoppingCar;

public interface IShoppingCarRepository extends CrudRepository<ShoppingCar, Long> {

}
