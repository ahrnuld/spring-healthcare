package ahrnuld.springhealthcare.services.map;

import ahrnuld.springhealthcare.model.PetType;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeServiceMap extends  AbstractMapService<PetType, Long> {
    @Override
    Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    PetType findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    void delete(PetType object) {
        super.delete(object);
    }
}
