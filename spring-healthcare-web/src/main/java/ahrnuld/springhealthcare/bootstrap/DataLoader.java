package ahrnuld.springhealthcare.bootstrap;

import ahrnuld.springhealthcare.model.Doctor;
import ahrnuld.springhealthcare.model.Owner;
import ahrnuld.springhealthcare.services.DoctorService;
import ahrnuld.springhealthcare.services.OwnerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final DoctorService doctorService;

    public DataLoader(OwnerService ownerService, DoctorService doctorService) {

        this.ownerService = ownerService;
        this.doctorService = doctorService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Doctor doc1 = new Doctor();
        doc1.setId(1L);
        doc1.setFirstName("Emmet");
        doc1.setLastName("Brown");

        doctorService.save(doc1);

        Doctor doc2 = new Doctor();
        doc2.setId(1L);
        doc2.setFirstName("Doctor");
        doc2.setLastName("No");

        doctorService.save(doc2);

        System.out.println("Loaded Doctors...");
    }
}
