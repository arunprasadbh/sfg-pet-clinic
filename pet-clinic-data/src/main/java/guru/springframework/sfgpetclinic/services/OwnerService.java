package guru.springframework.sfgpetclinic.services;

/*
 * Created by arunabhamidipati on 03/10/2019
 */

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long Id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
