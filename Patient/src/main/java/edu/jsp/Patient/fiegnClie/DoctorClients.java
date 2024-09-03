package edu.jsp.Patient.fiegnClie;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.jsp.Patient.dao.Doctor;


@FeignClient("DOCTOR")

public interface DoctorClients {

	
	    @GetMapping("/doctor/patient/{pId}")
		public List<Doctor> patientWithDoctor(@PathVariable("pId")int pId);
		
	
}
