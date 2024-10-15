package com.targetcoders.springbootcodingstyle.api;

import com.targetcoders.springbootcodingstyle.command.CommandNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class CommandControllerExceptionHandler {

  @ExceptionHandler(CommandNotFoundException.class)
  public ResponseEntity<ResponseErrorDto> handleCommandNotFoundException() {
    return ResponseEntity.badRequest().body(
        ResponseErrorDto.create(HttpStatus.BAD_REQUEST.value(), "ERROR_001", "command not found"));
  }
}
