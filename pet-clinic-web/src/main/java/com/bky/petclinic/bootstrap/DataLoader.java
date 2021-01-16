package com.bky.petclinic.bootstrap;

import com.bky.petclinic.model.Owner;
import com.bky.petclinic.model.Vet;
import com.bky.petclinic.services.OwnerService;
import com.bky.petclinic.services.VetService;
import com.bky.petclinic.services.map.OwnerMapService;
import com.bky.petclinic.services.map.VetMapService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerMapService();
        this.vetService = new VetMapService();
    }
    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
//        owner1.setAddress("123 Brickerel");
//        owner1.setCity("Miami");
//        owner1.setTelephone("1231231234");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
//        owner2.setAddress("123 Brickerel");
//        owner2.setCity("Miami");
//        owner2.setTelephone("1231231234");
        ownerService.save(owner1);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
//        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
//        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);

        log.info("Finished loading data....");
    }
}
