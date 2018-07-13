package za.co.memela.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import za.co.memela.api.model.PatientResult;

public interface PatientResultRepository
		extends
			JpaRepository<PatientResult, Integer> {

}
