package edu.java.laboratorywork4.service;


import edu.java.laboratorywork4.Exceptions.UserAlreadyExistsException;
import edu.java.laboratorywork4.controllers.dto.UserDTO;

import java.util.List;

public interface UserService {

	UserDTO addUser(UserDTO user) throws UserAlreadyExistsException;

	List<UserDTO> getUsers();
}
