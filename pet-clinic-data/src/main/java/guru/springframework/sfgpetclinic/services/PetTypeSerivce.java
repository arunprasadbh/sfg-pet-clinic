package guru.springframework.sfgpetclinic.services;

/*
 * Created by arunabhamidipati on 17/10/2019
 */

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeSerivce extends CrudService<PetType, Long> {
}
