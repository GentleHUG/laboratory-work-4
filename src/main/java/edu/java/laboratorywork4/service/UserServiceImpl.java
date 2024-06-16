package edu.java.laboratorywork4.service;


import edu.java.laboratorywork4.Exceptions.UserAlreadyExistsException;
import edu.java.laboratorywork4.controllers.dto.UserDTO;
import edu.java.laboratorywork4.domain.UsersRepository;
import edu.java.laboratorywork4.domain.entities.User;
import edu.java.laboratorywork4.util.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

	private final UsersRepository usersRepository;
	private final UserMapper userMapper;

	@Override
	public UserDTO addUser(UserDTO userDTO) throws UserAlreadyExistsException {

		User prevUser = usersRepository.findByFirstNameAndLastName(userDTO.firstName(), userDTO.lastName());

		if (prevUser != null) {
			throw new UserAlreadyExistsException();
		}

		User user = userMapper.JpaFromDto(userDTO);
		usersRepository.save(user);

		return userMapper.dtoFromJpa(user);
	}

	@Override
	public List<UserDTO> getUsers() {
		return usersRepository
				.findAll()
				.stream()
				.map(userMapper::dtoFromJpa)
				.toList();
	}
}
