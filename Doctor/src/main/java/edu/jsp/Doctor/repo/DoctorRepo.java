package edu.jsp.Doctor.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.jsp.Doctor.dao.Doctor;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Integer> {

	List<Doctor> findByPId(int pId);
}
