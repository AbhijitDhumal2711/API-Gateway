package edu.jsp.Patient.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.Patient.dao.Doctor;
import edu.jsp.Patient.dao.Patient;
import edu.jsp.Patient.fiegnClie.DoctorClients;
import edu.jsp.Patient.repo.PatientRepo;
import edu.jsp.Patient.serviceinter.PatientInter;

@Service
public class PatientService implements PatientInter {

	
	
	@Autowired
	DoctorClients clients;
	
	


	@Autowired
	
	private PatientRepo patientRepo;
	
	
	public Patient  savePatient(Patient patient) {
		
		return patientRepo.save(patient);
	}
	
	

	public Patient  getPatient(int id) {
		
		Patient patient=patientRepo.findById(id).get();
		
		patient.setDoctors(clients.patientWithDoctor(patient.getpId()));
		
		return patient;
	}
	

	public List<Patient>  getAllPatient() {
		
		List<Patient>  patients=patientRepo.findAll();
		
		List<Patient>  patientss=patients.stream().map(patient->{patient.setDoctors(clients.patientWithDoctor(patient.getpId()));
			
		return patient;
		}).collect(Collectors.toList());
		
		
		return patientss;
		
	}
	

	public Patient  updatePatient(Patient patient) {
		
		return patientRepo.save(patient);
	}
	
	public boolean deletePatient(int id) {
		
		if(id!=0) {
			patientRepo.deleteById(id);
			return true;
		}else {
			return false;
		}
	}



	@Override
	public Patient updatePatients(int pId, Patient patient) {
		
		Patient patient2=patientRepo.findById(pId).get();
		
		patient2.setName(patient.getName());
		
		return patientRepo.save(patient2);
	}
}
