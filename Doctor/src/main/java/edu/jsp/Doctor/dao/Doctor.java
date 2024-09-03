package edu.jsp.Doctor.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dId;
	
	private String name;
	
	private int pId;

	
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}
	
}
