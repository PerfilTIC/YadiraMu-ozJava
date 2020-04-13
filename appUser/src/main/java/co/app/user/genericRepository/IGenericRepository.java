package co.app.user.genericRepository;

import java.io.Serializable;
import java.util.List;
/**
This is a generic interface to implement save, delete, get and getAll methods.
 * @author yadira muñoz herrera
 */
public interface IGenericRepository<T, I extends Serializable> {

	T save(T entity);

    /**
     * Metodo que elimna de la bd
     *
     * @param id del objeto que se desea eliminar
     */
    void delete(I id);

    /**
     * Metodo que retorna un solo objeto de una lista por el id
     *
     * @param id el objeto que se desea buscar en la lista
     * @return el objeto encontradod e la lista
     */
    T get(I id);

    /**
     * Metodo que retorna un resultList
     *
     * @return un resulList de un objeto
     */
    List<T> getAll();

}
