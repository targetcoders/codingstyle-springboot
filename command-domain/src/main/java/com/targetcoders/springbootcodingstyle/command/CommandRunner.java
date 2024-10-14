package com.targetcoders.springbootcodingstyle.command;

import com.targetcoders.springbootcodingstyle.commandhistory.CommandHistory;
import com.targetcoders.springbootcodingstyle.commandhistory.CommandHistoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class CommandRunner {

  private final CommandProcessorFactoryBeanFinder factoryBeanFinder;
  private final CommandHistoryService commandHistoryService;

  public String run(String symbol, String data) {
    log.info("symbol={}, data={}", symbol, data);

    CommandProcessorFactory commandProcessorFactory = factoryBeanFinder.getFactoryBean(symbol);
    String result = commandProcessorFactory.process(data);
    commandHistoryService.save(CommandHistory.create(symbol, data, result));

    log.info("result={}", result);
    return result;
  }
}
