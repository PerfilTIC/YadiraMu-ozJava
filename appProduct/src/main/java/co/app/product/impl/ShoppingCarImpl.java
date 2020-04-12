package co.app.product.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import co.app.product.genericRepository.GenericRepository;
import co.app.product.model.ShoppingCar;
import co.app.product.repository.IShoppingCarRepository;
import co.app.product.service.ShoppingCarService;

@Transactional
@Service
public class ShoppingCarImpl extends GenericRepository<ShoppingCar, Long> implements ShoppingCarService{

	@Autowired
	IShoppingCarRepository shopCarRepository;
	
	@Override
	public CrudRepository<ShoppingCar, Long> getRepo() {
		
		return shopCarRepository;
	}

}
