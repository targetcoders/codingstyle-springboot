package com.targetcoders.springbootcodingstyle.command.echoupper;

import com.targetcoders.springbootcodingstyle.command.Command;
import com.targetcoders.springbootcodingstyle.command.CommandProcessor;
import org.springframework.stereotype.Component;

@Component
public class EchoUpperCommandProcessor extends CommandProcessor {

  @Override
  public Command createCommand(String data) {
    return new EchoUpperCommand(data);
  }
}
