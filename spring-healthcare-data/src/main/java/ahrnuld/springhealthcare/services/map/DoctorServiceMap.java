package ahrnuld.springhealthcare.services.map;

import ahrnuld.springhealthcare.model.Doctor;
import ahrnuld.springhealthcare.services.DoctorService;
import ahrnuld.springhealthcare.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DoctorServiceMap extends AbstractMapService<Doctor, Long> implements DoctorService {

    private final SpecialtyService specialtyService;

    public DoctorServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Doctor> findAll() {
        return super.findAll();
    }

    @Override
    public Doctor findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Doctor save(Doctor object) {

        if (object.getSpecialties().size() > 0) {
            object.getSpecialties().forEach(specialty -> {
                if (specialty.getId() == null) {
                    specialty = specialtyService.save(specialty);
                }
            });
        }

        return super.save(object);
    }

    @Override
    public void delete(Doctor object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
