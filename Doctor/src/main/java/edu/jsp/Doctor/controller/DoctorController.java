package edu.jsp.Doctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.Doctor.dao.Doctor;
import edu.jsp.Doctor.service.DoctorService;

@RestController
public class DoctorController {

	
	@Autowired
	
	private DoctorService doctorService;
	
	@PostMapping("/doctor")
	public Doctor saveDoctor(@RequestBody Doctor doctor) {
		return doctorService.saveDoctor(doctor);
	}
	
	@GetMapping("/doctor/patient/{pId}")
	public List<Doctor> getDoctorWithPatient(@PathVariable("pId") int pId) {
		return doctorService.getDoctorOfPatient(pId);
	}
	
	@GetMapping("/doctor")
	public List<Doctor> getAllDoctor(){
		
		return doctorService.getAllDoctor();
	}
	
}
