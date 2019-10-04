package guru.springframework.sfgpetclinic.services;

/*
 * Created by arunabhamidipati on 04/10/2019
 */

import guru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
