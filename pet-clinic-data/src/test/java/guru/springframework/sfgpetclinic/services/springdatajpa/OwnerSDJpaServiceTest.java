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

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
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

    Owner returnOwner;
    @BeforeEach
    void setUp() {
        returnOwner = new Owner();
        returnOwner.setId(1L);
        returnOwner.setLastName(lastName);
    }

    @Test
    void findByLastName() {


        when(ownerRepository.findByLastName(any())).thenReturn(Optional.of(returnOwner));
        Owner arun = ownerService.findByLastName(lastName);
        assertEquals(lastName, arun.getLastName());
    }

    @Test
    void findAll() {
        Set<Owner> returnOwersSet = new HashSet<>();
        Owner owner1 = new Owner();
        owner1.setId(1L);
        Owner owner2 = new Owner();
        owner2.setId(2L);
        returnOwersSet.add(owner1);
        returnOwersSet.add(owner2);

        when(ownerService.findAll()).thenReturn(returnOwersSet);
        Set<Owner> owners = ownerService.findAll();

        assertNotNull(owners);
        assertEquals(2, owners.size());
    }

    @Test
    void findById() {

        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));

        Owner owner = ownerService.findById(1L);

        assertNotNull(owner);
    }

    @Test
    void save() {
        Owner owner1 = new Owner();
        owner1.setId(1L);
    }

    @Test
    void delete() {
        ownerService.delete(returnOwner);

        verify(ownerRepository).delete(any());
    }

    @Test
    void deleteById() {
    }
}