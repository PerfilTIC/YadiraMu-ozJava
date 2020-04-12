package co.app.product.genericRepository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public abstract class GenericRepository<T, I extends Serializable> implements IGenericRepository<T, I> {

	@Override
	public T save(T entity) {
		return getRepo().save(entity);
	}
	
	@Override
	public void delete(I id) {
		getRepo().deleteById(id);
	}
	
	@Override
	public T get(I id) {
		Optional<T> obj = getRepo().findById(id);
		if (obj.isPresent()) {
			return obj.get();
		}
		return null;
	}

	/*
	 * Metodo que retorna una lista tipo <T>
	 */
	@Override
	public List<T> getAll() {
		List<T> returnArrayList = new ArrayList<>();
		getRepo().findAll().forEach(returnArrayList::add);
		return returnArrayList;
	}
	
	public abstract CrudRepository<T, I> getRepo();
	
	
}
