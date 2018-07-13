package za.co.memela.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import za.co.memela.api.model.User;
import za.co.memela.api.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/getAllUsers")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/getUserByName/{username}")
	public User getUserByName(@PathVariable String username) {
		return userRepository.findByUsername(username);
	}

	@GetMapping("/getUserByNameAndPassword/{username}/{password}")
	public User getUserByNameAndPassword(@PathVariable String username,
			@PathVariable String password) {
		return userRepository.findByUsernameAndPassword(username, password);
	}

}
