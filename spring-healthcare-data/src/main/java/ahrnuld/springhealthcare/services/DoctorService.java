package ahrnuld.springhealthcare.services;

import ahrnuld.springhealthcare.model.Doctor;

import java.util.Set;

public interface DoctorService {
    Doctor findById(Long id);
    Doctor findByLastName(String lastName);
    Doctor save(Doctor doctor);
    Set<Doctor> findAll();
}
