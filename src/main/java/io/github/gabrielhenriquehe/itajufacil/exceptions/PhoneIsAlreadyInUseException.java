package io.github.gabrielhenriquehe.itajufacil.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Phone number is already in use.")
public class PhoneIsAlreadyInUseException extends RuntimeException {
    public PhoneIsAlreadyInUseException(String message) {
        super(message);
    }
}
