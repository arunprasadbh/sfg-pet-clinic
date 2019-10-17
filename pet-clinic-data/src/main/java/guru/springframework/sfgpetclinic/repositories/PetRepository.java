package guru.springframework.sfgpetclinic.repositories;

/*
 * Created by arunabhamidipati on 17/10/2019
 */

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
