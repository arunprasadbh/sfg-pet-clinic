package guru.springframework.sfgpetclinic.services;

/*
 * Created by arunabhamidipati on 04/10/2019
 */

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
    
}
