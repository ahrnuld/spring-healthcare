package ahrnuld.springhealthcare.services;

import ahrnuld.springhealthcare.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
