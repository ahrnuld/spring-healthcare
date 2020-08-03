package ahrnuld.springhealthcare.services.jpa;

import ahrnuld.springhealthcare.model.Owner;
import ahrnuld.springhealthcare.repositories.OwnerRepository;
import ahrnuld.springhealthcare.repositories.PetRepository;
import ahrnuld.springhealthcare.repositories.PetTypeRepository;
import ahrnuld.springhealthcare.services.map.OwnerServiceMap;
import ahrnuld.springhealthcare.services.map.PetServiceMap;
import ahrnuld.springhealthcare.services.map.PetTypeServiceMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerServiceJpaTest {

    final Long ownerId = 1l;
    final String lastName = "Smith";
    Owner anOwner;

    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerServiceJpa ownerServiceJpa;

    @BeforeEach
    void setUp() {
        anOwner = new Owner();
        anOwner.setId(1L);
        anOwner.setLastName(lastName);
    }

    @Test
    void findByLastName() {

        when(ownerRepository.findByLastName(any())).thenReturn(anOwner);

        Owner owner = ownerServiceJpa.findByLastName(lastName);

        assertEquals(lastName, owner.getLastName());
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