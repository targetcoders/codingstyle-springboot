package com.targetcoders.springbootcodingstyle.command;

public interface Command {

  String run();
  default String name() {
    return this.getClass().getSimpleName();
  }
}
