package edu.java.laboratorywork4.Exceptions;

public class UserAlreadyExistsException extends Exception{

	public UserAlreadyExistsException() {
		super("User like this Already Exists!");
	}
}
