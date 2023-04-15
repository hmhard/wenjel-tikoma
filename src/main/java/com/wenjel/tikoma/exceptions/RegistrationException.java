package com.wenjel.tikoma.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created on April, 2020
 *
 * @author Miniyahil
 */
@Getter
@RequiredArgsConstructor
public class RegistrationException extends RuntimeException {

	private final String errorMessage;

}
