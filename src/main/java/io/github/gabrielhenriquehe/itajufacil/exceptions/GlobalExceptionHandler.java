package io.github.gabrielhenriquehe.itajufacil.exceptions;

import io.github.gabrielhenriquehe.itajufacil.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(EmailAlreadyInUseException.class)
    public ResponseEntity<ApiResponse<Void>> handleUserAlreadyExistsException(EmailAlreadyInUseException e) {
        ApiResponse<Void> response = new ApiResponse<Void>(HttpStatus.CONFLICT.value(), e.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
    }

    @ExceptionHandler(PhoneIsAlreadyInUseException.class)
    public ResponseEntity<ApiResponse<Void>> handlePhoneIsAlreadyInUseException(PhoneIsAlreadyInUseException e) {
        ApiResponse<Void> response = new ApiResponse<Void>(HttpStatus.CONFLICT.value(), e.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
    }
}
