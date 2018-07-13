package za.co.memela.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import za.co.memela.api.model.PatientResult;
import za.co.memela.api.repository.PatientResultRepository;

@RestController
public class PatientResultController {

	@Autowired
	private PatientResultRepository patientResultRepository;

	@PostMapping("/capturePatientResult")
	public String capturePatientResult(
			@RequestBody PatientResult patientResult) {
		patientResultRepository.save(patientResult);
		return "PatientResult saved..";
	}

	@GetMapping("/getAllPatientResults")
	public List<PatientResult> getAllPatientResults() {
		return patientResultRepository.findAll();
	}
}
