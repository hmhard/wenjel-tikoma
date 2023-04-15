package com.wenjel.tikoma.security.service;

import com.wenjel.tikoma.model.User;
import com.wenjel.tikoma.security.dto.AuthenticatedUserDto;
import com.wenjel.tikoma.security.dto.RegistrationRequest;
import com.wenjel.tikoma.security.dto.RegistrationResponse;

/**
 * Created on April, 2020
 *
 * @author Miniyahil
 */
public interface UserService {

	User findByUsername(String username);

	RegistrationResponse registration(RegistrationRequest registrationRequest);

	AuthenticatedUserDto findAuthenticatedUserByUsername(String username);

}
