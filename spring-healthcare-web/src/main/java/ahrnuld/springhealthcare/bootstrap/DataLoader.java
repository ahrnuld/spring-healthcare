package ahrnuld.springhealthcare.bootstrap;

import ahrnuld.springhealthcare.model.Doctor;
import ahrnuld.springhealthcare.model.Owner;
import ahrnuld.springhealthcare.model.Pet;
import ahrnuld.springhealthcare.model.PetType;
import ahrnuld.springhealthcare.services.DoctorService;
import ahrnuld.springhealthcare.services.OwnerService;
import ahrnuld.springhealthcare.services.PetTypeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final DoctorService doctorService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, DoctorService doctorService, PetTypeService petTypeService) {

        this.ownerService = ownerService;
        this.doctorService = doctorService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");

        PetType cat = new PetType();
        cat.setName("Cat");

        dog = petTypeService.save(dog);
        cat = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("555-12345");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(dog);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Roscoe");

        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("24 fifth avenue");
        owner2.setCity("New York");
        owner2.setTelephone("555-54321");

        Pet fionasPet = new Pet();
        fionasPet.setPetType(cat);
        fionasPet.setOwner(owner2);
        fionasPet.setBirthDate(LocalDate.now());
        fionasPet.setName("Micky");

        owner2.getPets().add(fionasPet);


        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Doctor doc1 = new Doctor();
        doc1.setFirstName("Emmet");
        doc1.setLastName("Brown");

        doctorService.save(doc1);

        Doctor doc2 = new Doctor();
        doc2.setFirstName("Doctor");
        doc2.setLastName("No");

        doctorService.save(doc2);

        System.out.println("Loaded Doctors...");


    }
}
