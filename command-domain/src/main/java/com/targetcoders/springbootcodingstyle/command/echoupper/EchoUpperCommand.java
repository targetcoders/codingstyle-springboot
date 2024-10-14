package com.targetcoders.springbootcodingstyle.command.echoupper;

import com.targetcoders.springbootcodingstyle.command.Command;
import java.util.Locale;

public class EchoUpperCommand implements Command {

  private final String data;

  public EchoUpperCommand(String data) {
    this.data = data;
  }

  @Override
  public String run() {
    if (data == null) {
      return "";
    }

    return data.toUpperCase(Locale.ROOT);
  }

  @Override
  public String name() {
    return "echoUpper";
  }

  public static EchoUpperCommand create(String data) {
    return new EchoUpperCommand(data);
  }
}
