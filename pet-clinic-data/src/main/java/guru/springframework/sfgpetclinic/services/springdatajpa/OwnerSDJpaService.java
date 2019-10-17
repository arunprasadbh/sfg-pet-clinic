package guru.springframework.sfgpetclinic.services.springdatajpa;

/*
 * Created by arunabhamidipati on 17/10/2019
 */

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerService ownerService;

    public OwnerSDJpaService(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerService.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerService.findAll().iterator().forEachRemaining(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerService.findById(aLong);
    }

    @Override
    public Owner save(Owner object) {
        return ownerService.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerService.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerService.deleteById(aLong);
    }
}
