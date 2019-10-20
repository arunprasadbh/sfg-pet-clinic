package guru.springframework.sfgpetclinic.services.map;

/*
 * Created by arunabhamidipati on 20/10/2019
 */

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.PetTypeSerivce;

import java.util.Set;

public class PetTypeServiceMap extends AbstractMapServices<PetType, Long> implements PetTypeSerivce {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return save(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);

    }
}
