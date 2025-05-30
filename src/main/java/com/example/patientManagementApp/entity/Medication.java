// PACKAGE
package com.example.patientManagementApp.entity;

// IMPORTS
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// ANNOTATIONS
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity // Annotation used to create a table in the database
@Table(name = "medications") // Annotation used to specify the table name in the database
public class Medication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate primary key
    private long id;

    @Column(length = 100, nullable = false) // Field for medication name with a length constraint
    private String name;

    @Column(nullable = false) // Field for frequency, cannot be null
    private String frequency;

    @Column(length = 500) // Field for dosage with a length constraint
    private String dosage;

    // Relationship to Patient entity
    @ManyToOne(fetch = FetchType.LAZY) // Lazy loading of associated Patient
    @JoinColumn(name = "patient_id", nullable = false) // Foreign key for Patient
    private Patient patient;

    // Relationship to Doctor entity
    @ManyToOne(fetch = FetchType.LAZY) // Lazy loading of associated Doctor
    @JoinColumn(name = "doctor_id", nullable = false) // Foreign key for Doctor
    private Doctor doctor;

    // Custom method that is currently not implemented
    public Medication orElse(Object o) {
        return null; // This should be properly implemented if needed
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
    
    
}
