package com.targetcoders.springbootcodingstyle.command;

public class CommandNotFoundException extends RuntimeException {

  public CommandNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
