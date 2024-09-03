package edu.jsp.Doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.Doctor.dao.Doctor;
import edu.jsp.Doctor.repo.DoctorRepo;
import edu.jsp.Doctor.serviceinter.DoctorInter;

@Service
public class DoctorService implements DoctorInter {

	
	@Autowired
	
	private DoctorRepo doctorRepo;
	
	public Doctor saveDoctor(Doctor doctor) {
		return doctorRepo.save(doctor);
	}

	@Override
	public Doctor updateDoctor(int id, Doctor doctor) {

		Doctor doctor2=doctorRepo.findById(id).get();
		
		
		doctor2.setName(doctor.getName());
		
		return doctorRepo.save(doctor2);
	}

	

	

	@Override
	public List<Doctor> getAllDoctor() {
		// TODO Auto-generated method stub
		return doctorRepo.findAll();
	}

	@Override
	public Doctor getDoctor(int dId) {
		// TODO Auto-generated method stub
		return doctorRepo.findById(dId).get();
	}

	@Override
	public List<Doctor> getDoctorOfPatient(int pId) {
		// TODO Auto-generated method stub
		return doctorRepo.findByPId(pId);
	}

	
	
	
}
