package edu.jsp.Doctor.serviceinter;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.jsp.Doctor.dao.Doctor;

@Service
public interface DoctorInter {

	
	public Doctor updateDoctor(int id,Doctor doctor);
	
	public List<Doctor> getDoctorOfPatient(int pId);
	
	public List<Doctor> getAllDoctor();
	
	public Doctor getDoctor(int dId);
}
