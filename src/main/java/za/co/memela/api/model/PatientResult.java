package za.co.memela.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientResult {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	private String email;
	private int height;
	private int weight;
	private int sbp;
	private int dbp;
	private String capturedby;
	@Temporal(TemporalType.TIMESTAMP)
	private Date capturedon;

	@PrePersist
	private void prePersist() {
		capturedon = new Date();
	}

	@PreUpdate
	private void preUpdate() {
		capturedon = new Date();
	}

}