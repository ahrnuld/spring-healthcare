package ahrnuld.springhealthcare.model;

import java.util.HashSet;
import java.util.Set;

public class Doctor extends Person {

    private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
