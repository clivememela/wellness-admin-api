package za.co.memela.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import za.co.memela.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsername(String username);

	public User findByUsernameAndPassword(String username, String password);
}
