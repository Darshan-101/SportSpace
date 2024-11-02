package com.jsp.SportSpace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.SportSpace.entity.TurfOwner;

@Repository
public interface TurfOwnerRepository extends JpaRepository<TurfOwner, Integer>{

	TurfOwner findByEmailAndPassword(String email,String password);
}
