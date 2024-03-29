package guru.springframework.sfgpetclinic.services.map;

/*
 * Created by arunabhamidipati on 04/10/2019
 */

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.CrudService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapServices<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {

        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {

        return super.save( object);
    }

    @Override
    public Vet findById(Long id) {

        return super.findById(id);
    }
}
