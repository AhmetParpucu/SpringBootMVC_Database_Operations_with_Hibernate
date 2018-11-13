package com.ahmet.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Veri tabanimizdaki tablolarimiza karsilik gelen Java siniflarimiz bizim Entity siniflarimiz oluyor. Tablolarimizdaki sutunlar da bu Entity siniflari içindeki degiskenler ile ifade ediliyor.
@Table(name="student") // Bu class'i veritanindaki student table'ina mapping yapilir.
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Idlerin otomatik arttir vb. olaylar bu sekilde eklenir
	@Column(name="id")
	private int id;
	
	@Column(name="firstName") // Mapping yapilirken databasede kullanilan sutun isimleriyle ayni olmali
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="email")
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
