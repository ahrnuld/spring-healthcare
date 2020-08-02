package ahrnuld.springhealthcare.services.jpa;

import ahrnuld.springhealthcare.model.Doctor;
import ahrnuld.springhealthcare.repositories.DoctorRepository;
import ahrnuld.springhealthcare.services.DoctorService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")
public class DoctorServiceJpa implements DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorServiceJpa(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Set<Doctor> findAll() {
        Set<Doctor> doctors = new HashSet<>();
        doctorRepository.findAll().forEach(doctors::add);
        return doctors;
    }

    @Override
    public Doctor findById(Long aLong) {
        return doctorRepository.findById(aLong).orElse(null);
    }

    @Override
    public Doctor save(Doctor object) {
        return doctorRepository.save(object);
    }

    @Override
    public void delete(Doctor object) {
        doctorRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        doctorRepository.deleteById(aLong);
    }
}
