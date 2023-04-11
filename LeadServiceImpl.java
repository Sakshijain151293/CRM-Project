package com.zohocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Lead;
import com.zohocrm.repositories.LeadRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;
@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveOneLead(Lead lead) {
		leadRepo.save(lead);
		
	}

	@Override
	public Lead findLeadById(long id) {
		java.util.Optional<Lead> findById=leadRepo.findById(id);
		Lead lead=findById.get();
		return lead;
	}

	@Override
	public void deleteLeadById(long id) {
		leadRepo.deleteById(id);
		
	}

	@Override
	public List<Lead> getAllLeads() {
	List<Lead> leads=leadRepo.findAll();
		return leads;
	}

}
