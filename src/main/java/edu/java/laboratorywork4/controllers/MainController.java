package edu.java.laboratorywork4.controllers;

import edu.java.laboratorywork4.Exceptions.UserAlreadyExistsException;
import edu.java.laboratorywork4.controllers.dto.UserDTO;
import edu.java.laboratorywork4.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Log4j2
@RestController
@RequestMapping("user-api/v1/users")
@Tag(name = "Main controller", description = "Controller for main function!")
@AllArgsConstructor
public class MainController {

	private final UserService userService;

	@GetMapping
	public ResponseEntity<List<UserDTO>> getUserList() {

		log.info("Users was gotten!\n");

		List<UserDTO> userDTOList = userService.getUsers();
		return ResponseEntity.ok().body(userDTOList);
	}

	@PostMapping
	public ResponseEntity<UserDTO> postUser(@RequestBody @Valid UserDTO userDTO) throws UserAlreadyExistsException {

		log.info("User {}was posted!\n", userDTO);

		UserDTO newUserFTO = userService.addUser(userDTO);
		return ResponseEntity.ok().body(newUserFTO);
	}
}
