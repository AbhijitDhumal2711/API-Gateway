package edu.jsp.Patient.dao;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pId;
	
	private String name;
	
	@Transient
	private List<Doctor> doctors;

	
	
	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	
	
}
