package guru.springframework.sfgpetclinic.repositories;

/*
 * Created by arunabhamidipati on 17/10/2019
 */

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public abstract class VisitRepository implements CrudRepository<Visit, Long> {
}
