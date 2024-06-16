package edu.java.laboratorywork4.domain.entities;

import edu.java.laboratorywork4.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Users")
@NoArgsConstructor
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(name = "first_name", nullable = false)
	String firstName;

	@Column(name = "last_name", nullable = false)
	String lastName;

	@Enumerated(EnumType.STRING)
	Role role;

	public User(String firstName, String lastName, Role role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}
}
