package co.app.product.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import co.app.product.genericRepository.GenericRepository;
import co.app.product.model.Category;
import co.app.product.repository.ICategoryRepository;
import co.app.product.service.CategoryService;

@Transactional
@Service
public class CategoryImpl extends GenericRepository<Category, Long> implements CategoryService{

	@Autowired
	ICategoryRepository catRepository;
	
	@Override
	public CrudRepository<Category, Long> getRepo() {		
		return catRepository;
	}

	@Override
	public List<Category> showCategories() {
		return catRepository.showCategories();
	}

}
