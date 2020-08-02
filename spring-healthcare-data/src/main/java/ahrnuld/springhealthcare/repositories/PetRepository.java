package ahrnuld.springhealthcare.repositories;

import ahrnuld.springhealthcare.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
