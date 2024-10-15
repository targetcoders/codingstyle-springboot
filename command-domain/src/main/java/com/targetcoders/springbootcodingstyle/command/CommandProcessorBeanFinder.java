package com.targetcoders.springbootcodingstyle.command;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class CommandProcessorBeanFinder {

  private final ApplicationContext context;

  public CommandProcessor getFactoryBean(String symbol) {
    log.info("find {}CommandProcessor", symbol);
    try {
      return (CommandProcessor) context.getBean(symbol + "CommandProcessor");

    } catch (NoSuchBeanDefinitionException e) {
      log.error("CommandProcessor Bean not found", e);
      throw new CommandNotFoundException("CommandProcessor not found", e);
    }
  }
}
