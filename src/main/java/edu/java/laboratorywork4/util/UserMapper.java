package edu.java.laboratorywork4.util;

import edu.java.laboratorywork4.controllers.dto.UserDTO;
import edu.java.laboratorywork4.domain.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
	public UserDTO dtoFromJpa(User user) {
		return new UserDTO(
				user.getId(),
				user.getFirstName(),
				user.getLastName(),
				user.getRole()
		);
	}

	public User JpaFromDto(UserDTO user) {
		return new User(
				user.firstName(),
				user.lastName(),
				user.role()
		);
	}
}
