package com.targetcoders.springbootcodingstyle.command.echo;

import com.targetcoders.springbootcodingstyle.command.Command;

public class EchoCommand implements Command {

  private final String data;

  public EchoCommand(String data) {
    this.data = data;
  }

  @Override
  public String run() {
    if (data == null) {
      return "";
    }

    return data;
  }

  @Override
  public String name() {
    return "echo";
  }

  public static EchoCommand create(String data) {
    return new EchoCommand(data);
  }
}
