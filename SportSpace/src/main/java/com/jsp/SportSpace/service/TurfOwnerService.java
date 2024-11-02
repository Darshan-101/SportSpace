package com.jsp.SportSpace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.SportSpace.entity.TurfOwner;
import com.jsp.SportSpace.repository.TurfOwnerRepository;

@Service
public class TurfOwnerService {

	@Autowired
	TurfOwnerRepository turfOwnerRepo;
	
	public TurfOwner addTurfOwner(TurfOwner turfOwner){
		
		TurfOwner newTurfOwner = turfOwnerRepo.save(turfOwner);
		return newTurfOwner;
	}
	
	public TurfOwner getTurfOwnerByEmailAndPassword(String email, String password){
		
		TurfOwner turfOwnerFromDb = turfOwnerRepo.findByEmailAndPassword(email, password);
		return turfOwnerFromDb;
	}
	
	public TurfOwner modifyTurfOwner(TurfOwner turfOwner, int turfOwnerId) {
		
		TurfOwner turfOwnerFromDb = turfOwnerRepo.findById(turfOwnerId).orElse(null);
		if(turfOwnerFromDb != null) {
			turfOwnerFromDb.setOwnerName(turfOwner.getOwnerName());
			turfOwnerFromDb.setPassword(turfOwner.getPassword());
			turfOwnerFromDb.setMobile(turfOwner.getMobile());
			turfOwnerFromDb.setEmail(turfOwner.getEmail());
			
			TurfOwner updatedTurfOwner = turfOwnerRepo.save(turfOwnerFromDb);
			return updatedTurfOwner;
		}
		return null;
	}
	
	public boolean removeTurfOwner(int turfOwnerId) {
		
		TurfOwner turfOwnerFromDb = turfOwnerRepo.findById(turfOwnerId).orElse(null);
		if(turfOwnerFromDb != null) {
			turfOwnerRepo.deleteById(turfOwnerId);
			return true;
		}
		return false;
	}
	
	public List<TurfOwner> getAllTurfOwners(){
		
		List<TurfOwner> turfOwners = turfOwnerRepo.findAll();
		return turfOwners;
	}
	
	
}














