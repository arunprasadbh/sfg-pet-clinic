package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


/*
 * Created by arunabhamidipati on 20/10/2019
 */

class OwnerServiceMapTest {
    OwnerServiceMap ownerServiceMap;
    Long ownerId = 1L;
    String lastName = "Bhamidipati";
    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(), new PetServiceMap());
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setLastName(lastName);
        ownerServiceMap.save(owner1);
    }

    @Test
    void findAll() {
        Set<Owner> ownersSet = ownerServiceMap.findAll();

        assertEquals(1, ownersSet.size());
       // assertEquals(1L);
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);
        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void save() {
        Owner owner2 = new Owner();
        Long id = 2L;
        owner2.setId(id);
        Owner savedOwner = ownerServiceMap.save(owner2);
        assertEquals(id, savedOwner.getId());

    }

    @Test
    void findById() {
        Owner owner = ownerServiceMap.findById(ownerId);
        assertEquals(ownerId, owner.getId());
    }

    @Test
    void findByLastName() {
       Owner arun = ownerServiceMap.findByLastName(lastName);
       assertEquals(ownerId, arun.getId());

    }
}