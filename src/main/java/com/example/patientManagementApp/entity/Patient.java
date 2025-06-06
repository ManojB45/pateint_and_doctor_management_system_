// PACKAGE
package com.example.patientManagementApp.entity;

// IMPORTS
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// ANNOTATIONS
// Lombok annotations to avoid adding constructor, getter, and setter in entity
// and to improve code readability
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity // Annotation used to create a table in the database
@Table(name = "patients") // Annotation used to specify the table name in the database
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate primary key for the entity
    private long id;

    @Column(length = 50, nullable = false) // Field for patient's first name with a length constraint
    private String firstName;

    @Column(length = 50, nullable = false) // Field for patient's last name with a length constraint
    private String lastName;

    @Column(unique = true) // Ensure the email is unique in the database
    private String email;

    @Column(length = 20) // Field for patient's phone number with a length constraint
    private String phoneNumber;

    @Column(length = 100) // Field for patient's address with a length constraint
    private String address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    
}


