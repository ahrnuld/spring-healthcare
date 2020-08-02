package ahrnuld.springhealthcare.repositories;

import ahrnuld.springhealthcare.model.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {
}
