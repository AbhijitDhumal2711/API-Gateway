package edu.jsp.Patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.Patient.dao.Doctor;
import edu.jsp.Patient.dao.Patient;

import edu.jsp.Patient.service.PatientService;

@RestController
public class PatientController {


	@Autowired
	
	private PatientService patientService;
	
	
	@PostMapping("/patient")
	public Patient  savePatient( @RequestBody  Patient patient) {
		
		return patientService.savePatient(patient);
	}
	
	
	
	@PutMapping("/patient")
	public Patient  updatePatient(Patient patient) {
		
		return patientService.updatePatient(patient);
	}
	
	@GetMapping("/patient/{pId}")
	public Patient  getPatient(@PathVariable("pId") int pId) {
		
		
		return patientService.getPatient(pId);
	}
	
	@GetMapping("/patient")
	public List<Patient>  getAllPatient() {
		
		return patientService.getAllPatient();
	}
	
	@DeleteMapping("/patient/{pId}")
	public boolean  deletePatient(@PathVariable("pId") int pId) {
		
		return patientService.deletePatient(pId);
	}
	
	@PutMapping("/patient/{pId}")
	public Patient  updatesPatient(@PathVariable("pId") int pId,@RequestBody Patient patient) {
		
		return patientService.updatePatients(pId, patient);
	}
	
}
