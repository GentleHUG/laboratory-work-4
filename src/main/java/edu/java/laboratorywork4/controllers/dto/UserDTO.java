package edu.java.laboratorywork4.controllers.dto;

import edu.java.laboratorywork4.enums.Role;

public record UserDTO(
	Long id,
	String firstName,
	String lastName,
	Role role
) {
}
