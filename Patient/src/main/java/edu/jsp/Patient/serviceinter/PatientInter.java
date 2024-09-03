package edu.jsp.Patient.serviceinter;

import org.springframework.stereotype.Service;

import edu.jsp.Patient.dao.Patient;

@Service
public interface PatientInter {

	public Patient updatePatients(int pId,Patient patient );
}
