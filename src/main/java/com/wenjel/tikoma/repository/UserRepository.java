package com.wenjel.tikoma.repository;

import com.wenjel.tikoma.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on April, 2020
 *
 * @author Miniyahil
 */
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

	boolean existsByEmail(String email);

	boolean existsByUsername(String username);

}
