package ahrnuld.springhealthcare.bootstrap;

import ahrnuld.springhealthcare.model.*;
import ahrnuld.springhealthcare.services.DoctorService;
import ahrnuld.springhealthcare.services.OwnerService;
import ahrnuld.springhealthcare.services.PetTypeService;
import ahrnuld.springhealthcare.services.SpecialtyService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final DoctorService doctorService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, DoctorService doctorService, PetTypeService petTypeService, SpecialtyService specialtyService) {

        this.ownerService = ownerService;
        this.doctorService = doctorService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if(count == 0) {
            loadData();
        }
    }

    private void loadData() {
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

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty surgery = new Specialty();
        surgery.setDescription("Surgery");
        Specialty dentistry = new Specialty();
        dentistry.setDescription("Dentistry");

        radiology = specialtyService.save(radiology);
        surgery = specialtyService.save(surgery);
        dentistry = specialtyService.save(dentistry);

        Doctor doc1 = new Doctor();
        doc1.setFirstName("Emmet");
        doc1.setLastName("Brown");
        doc1.getSpecialties().add(radiology);

        doctorService.save(doc1);

        Doctor doc2 = new Doctor();
        doc2.setFirstName("Doctor");
        doc2.setLastName("No");
        doc2.getSpecialties().add(surgery);

        doctorService.save(doc2);

        System.out.println("Loaded Doctors...");
    }
}
