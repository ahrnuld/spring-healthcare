package ahrnuld.springhealthcare.model;

import java.util.Set;

public class Doctor extends Person {

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }

    private Set<Specialty> specialties;
}
