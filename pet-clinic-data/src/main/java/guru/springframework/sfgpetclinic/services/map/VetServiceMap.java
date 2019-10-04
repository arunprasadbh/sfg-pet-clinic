package guru.springframework.sfgpetclinic.services.map;

/*
 * Created by arunabhamidipati on 04/10/2019
 */

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapServices<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Vet object) {

    }

    @Override
    public Vet save(Vet object) {
        return null;
    }

    @Override
    public Vet findById(Long id) {
        return null;
    }
}
