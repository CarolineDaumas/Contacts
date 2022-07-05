package com.fms.contacts.Entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Category implements Serializable {

	

	private static final long serialVersionUID=1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "CAT_NAME")
	private String name;
	
	@OneToMany(mappedBy="category", cascade=CascadeType.ALL)
	private Collection<Contact> contacts;
	
//	public Category(String name) {
//		this.name=name;
//	}
}
