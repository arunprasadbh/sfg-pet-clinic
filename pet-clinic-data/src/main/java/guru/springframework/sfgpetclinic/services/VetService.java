package guru.springframework.sfgpetclinic.services;

/*
 * Created by arunabhamidipati on 03/10/2019
 */

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
