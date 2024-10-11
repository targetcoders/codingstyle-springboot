package com.targetcoders.springbootcodingstyle.command.echoupper;

import com.targetcoders.springbootcodingstyle.command.Command;
import com.targetcoders.springbootcodingstyle.command.CommandProcessorFactory;
import org.springframework.stereotype.Component;

@Component
public class EchoUpperCommandProcessorFactory extends CommandProcessorFactory {

  @Override
  public Command createCommand(String data) {
    return new EchoUpperCommand(data);
  }
}
