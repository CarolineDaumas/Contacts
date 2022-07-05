package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fms.contacts.Entities.Category;
import com.fms.contacts.Entities.Contact;

@SpringBootApplication
public class ContactsApplication implements CommandLineRunner{

	public static void main(String[] args){
		SpringApplication.run(ContactsApplication.class, args);
		
//		Category perso = new Category("Contacts personnels");
//		Category pro = new Category("Contacts professionnels");
		
//		Contact contact1= new Contact(1L,"jean", "dupont","06.21.32.32.32","j@aol.com","route de toulouse, Toulouse", perso);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
