package com.targetcoders.springbootcodingstyle.command.echo;

import com.targetcoders.springbootcodingstyle.command.CommandProcessorFactory;
import com.targetcoders.springbootcodingstyle.command.Command;
import org.springframework.stereotype.Component;

@Component
public class EchoCommandProcessorFactory extends CommandProcessorFactory {

  @Override
  public Command createCommand(String data) {
    return new EchoCommand(data);
  }
}
