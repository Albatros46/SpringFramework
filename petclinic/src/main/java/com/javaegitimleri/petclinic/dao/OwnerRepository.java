package com.javaegitimleri.petclinic.dao;
import java.util.List;

import com.javaegitimleri.petclinic.model.*;
public interface  OwnerRepository {
	List<Owner> findAll(); //Tum owner lerin tutulacagi liste.
	Owner findById(Long id);
	List<Owner> findByLastName(String lasName);
	void create(Owner owner);
	Owner update(Owner owner);
	void delete(Long id);
	
}
