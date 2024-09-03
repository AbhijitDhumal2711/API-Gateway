package edu.jsp.Patient.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.jsp.Patient.dao.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
