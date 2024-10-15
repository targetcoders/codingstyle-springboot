package com.targetcoders.springbootcodingstyle.command.echo;

import com.targetcoders.springbootcodingstyle.command.CommandProcessor;
import com.targetcoders.springbootcodingstyle.command.Command;
import org.springframework.stereotype.Component;

@Component
public class EchoCommandProcessor extends CommandProcessor {

  @Override
  public Command createCommand(String data) {
    return new EchoCommand(data);
  }
}
