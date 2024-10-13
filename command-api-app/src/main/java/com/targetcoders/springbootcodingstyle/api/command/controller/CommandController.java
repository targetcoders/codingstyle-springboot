package com.targetcoders.springbootcodingstyle.api.command.controller;

import com.targetcoders.springbootcodingstyle.command.CommandProcessorFactory;
import com.targetcoders.springbootcodingstyle.command.CommandProcessorBeanFinder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/command")
public class CommandController {

  private final CommandProcessorBeanFinder factoryBeanFinder;

  @PostMapping("/{symbol}")
  public String command(@PathVariable("symbol") String symbol, @RequestBody String data) {
    log.info("symbol={}, data={}", symbol, data);
    CommandProcessorFactory commandProcessorFactory = factoryBeanFinder.getBean(symbol);
    String result = commandProcessorFactory.process(data);
    log.info("result={}", result);
    return result;
  }
}
