package com.javaegitimleri.petclinic.dao.mem;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.javaegitimleri.petclinic.dao.OwnerRepository;
import com.javaegitimleri.petclinic.model.Owner;
//Repository sayesinde springbook calisma esnasinda bir bean olusturur
@Repository
public class OwnerRepositoryInMemoryImpl implements OwnerRepository {
	
	private Map<Long, Owner> ownersMap = new HashMap<>();
	
	public OwnerRepositoryInMemoryImpl() {
		Owner o1=new Owner();
		o1.setId(1L);
		o1.setFirstName("Servet");
		o1.setLastName("AKCADAG");
		ownersMap.put(o1.getId(), o1);
		//--------------------------------------
		Owner o2=new Owner();
		o2.setId(2L);
		o2.setFirstName("Akif");
		o2.setLastName("AKCADAG");
		ownersMap.put(o2.getId(), o2);
		//--------------------------------------
		Owner o3=new Owner();
		o3.setId(3L);
		o3.setFirstName("Turgut");
		o3.setLastName("Ton");
		ownersMap.put(o3.getId(), o3);
		//--------------------------------------
		Owner o4=new Owner();
		o4.setId(4L);
		o4.setFirstName("Mehmet");
		o4.setLastName("DEMIRHAN");
		ownersMap.put(o4.getId(), o4);
		//--------------------------------------
		Owner o5=new Owner();
		o5.setId(5L);
		o5.setFirstName("Ali");
		o5.setLastName("YILDIZ");
		ownersMap.put(o5.getId(), o5);
		//--------------------------------------
		Owner o6=new Owner();
		o6.setId(6L);
		o6.setFirstName("Salih");
		o6.setLastName("GULTEKIN");
		ownersMap.put(o6.getId(), o6);
		//--------------------------------------
		
		
	}
	@Override
	public List<Owner> findAll() {
		// Olusturulan owner leri arrayliste aktarip listelenmesini saglayacagiz.
		
		return new ArrayList<>(ownersMap.values());
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		
		return ownersMap.get(id);
	}

	@Override
	public List<Owner> findByLastName(String lasName) {
		// Java 8 de bulunan stream ve filteri lamda expression kullanarak soyada gore filtreleme yapiyoruz.
		return ownersMap.values().stream().filter(o->o.getLastName().equals(lasName)).collect(Collectors.toList());
	}

	@Override
	public void create(Owner owner) {
		// Owner nesnesine benzersiy id set etmesi icin Date kullanacagiz bu sekilde unique bir id uretecek
		owner.setId(new Date().getTime());
		ownersMap.put(owner.getId(), owner);
	}

	@Override
	public Owner update(Owner owner) {
		//Guncelleme yaparken ayni id kullancagi icin ...
		ownersMap.replace(owner.getId(), owner);
		return owner;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ownersMap.remove(id);
	}

}
