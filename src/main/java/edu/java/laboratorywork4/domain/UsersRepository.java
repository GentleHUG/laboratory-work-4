package edu.java.laboratorywork4.domain;

import edu.java.laboratorywork4.domain.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {

	public List<User> findAll();

	public User findByFirstNameAndLastName(String firstName, String lastName);
}
