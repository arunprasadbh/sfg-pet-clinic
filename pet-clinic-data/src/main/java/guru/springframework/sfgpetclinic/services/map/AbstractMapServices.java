package guru.springframework.sfgpetclinic.services.map;

/*
 * Created by arunabhamidipati on 04/10/2019
 */

import guru.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapServices<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    T findById(ID id){
        return map.get(id);
    }

    Set<T> findAll(){
        return new HashSet<T>(map.values());
    }

    T save(T object) {
        // System.out.println("Check 1");
        if (object != null) {
            // System.out.println("Check 1.2");
            if (object.getId() == null) {
                System.out.println("Check 2");
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }else {
            // System.out.println("check error");
            throw new RuntimeException("Object can not be null");
        }
        // System.out.println("Check 4");
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
    private Long getNextId(){
        Long nextId = null;
        try {
            nextId = (Long) (Collections.max(map.keySet())) + 1L;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
