package edu.java.laboratorywork4.controllers.dto;

import org.springframework.http.HttpStatus;

public record ErrorResponse(
		HttpStatus status,
		String reason
) {
}
