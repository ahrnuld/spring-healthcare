package ahrnuld.springhealthcare.repositories;

import ahrnuld.springhealthcare.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
