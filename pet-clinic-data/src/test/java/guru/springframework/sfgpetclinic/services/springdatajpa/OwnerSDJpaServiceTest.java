package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.repositories.OwnerRepository;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


/*
 * Created by arunabhamidipati on 20/10/2019
 */

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    final String lastName = "Bhamidipati";
    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    @Mock
    PetRepository petRepository;

    @InjectMocks
    OwnerSDJpaService ownerService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByLastName() {
        Owner returnOwner = new Owner();
        returnOwner.setId(1L);
        returnOwner.setLastName(lastName);

        when(ownerRepository.findByLastName(any())).thenReturn(Optional.of(returnOwner));
        Owner arun = ownerService.findByLastName(lastName);
        assertEquals(lastName, arun.getLastName());
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}