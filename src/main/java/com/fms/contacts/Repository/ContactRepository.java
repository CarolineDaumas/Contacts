package com.fms.contacts.Repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fms.contacts.Entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

	public Page<Contact> findByFirstNameContains(String keyWord, Pageable pageable);
}
