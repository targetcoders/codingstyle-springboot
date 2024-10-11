package com.targetcoders.springbootcodingstyle.command;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public abstract class CommandProcessorFactory {

  public String process(String data) {
    Command command = createCommand(data);
    log.info("run {}CommandProcessor data={}", command.name(), data);
    return command.run();
  }

  public abstract Command createCommand(String data);
}
