package com.fms.contacts.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Contact implements  Serializable{
	
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column (name="FIRST_NAME")
	@NotNull (message="ne peut pas être nul")
	@Size(min=3, max=20)
	private String firstName;
	
	@Column (name="LAST_NAME")
	@NotNull (message="ne peut pas être nul")
	@Size(min=3, max=20)
	private String lastName;
	
	private String phone;
	
	@Column
	@Email(regexp = ".+[@].+[\\.].+", message = "Entrez un mail valide")
	private String email;
	
	private String address;
	
	@ManyToOne
	@JoinColumn (name="CATEGORY_ID")
	private Category category;

}
