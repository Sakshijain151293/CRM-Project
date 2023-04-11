package com.zohocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.repositories.ContactRepository;
@Service

public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
		

	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact findContactById(long id) {
		java.util.Optional<Contact> findById=contactRepo.findById(id);
		Contact contact=findById.get();
		return contact;
	
	}

	@Override
	public Contact getContactById(long id) {
		java.util.Optional<Contact> findById=contactRepo.findById(id);
		Contact contact=findById.get();
		return contact;
	
	
		
	}

	

}
