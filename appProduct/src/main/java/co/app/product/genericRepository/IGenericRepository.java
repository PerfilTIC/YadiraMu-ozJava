package co.app.product.genericRepository;

import java.io.Serializable;
import java.util.List;

/**
This is a generic interface to implement save, delete, get and getAll methods.
 * @author yadira muñoz herrera
 */
public interface IGenericRepository<T, I extends Serializable> {

	T save(T entity);

    void delete(I id);

    T get(I id);
    
    List<T> getAll();

}
