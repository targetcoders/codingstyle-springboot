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

  public CommandProcessorFactory getBean(String symbol) {
    log.info("find {}CommandProcessor", symbol);
    try {
      return (CommandProcessorFactory) context.getBean(symbol + "CommandProcessorFactory");

    } catch (NoSuchBeanDefinitionException e) {
      log.error("not found the bean", e);
      throw e;
    }
  }
}
