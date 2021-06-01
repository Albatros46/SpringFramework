package com.javaegitimleri.petclinic.service;

import java.util.List;

import com.javaegitimleri.petclinic.exception.OwnerNotFoundException;
import com.javaegitimleri.petclinic.model.Owner;

public interface PetClinicService {
	//Owner ve pet nesneleri ile ilgili is mantigi iceren kisimlar yer alacak
	List<Owner> findOwners();
	List<Owner> findOwners(String lastName);
	Owner findOwner(Long id) throws OwnerNotFoundException;
	void createOwner(Owner owner);
	void update(Owner owner);
	void delete(Long id);
}
