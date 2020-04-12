package co.app.product.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import co.app.product.genericRepository.GenericRepository;
import co.app.product.model.Product;
import co.app.product.repository.IProductRepository;
import co.app.product.service.ProductService;

@Transactional
@Service
public class ProductImpl extends GenericRepository<Product, Long> implements ProductService {

	@Autowired
	IProductRepository repository;
	
	@Override
	public CrudRepository<Product, Long> getRepo() {
		return repository;
	}
	
}
