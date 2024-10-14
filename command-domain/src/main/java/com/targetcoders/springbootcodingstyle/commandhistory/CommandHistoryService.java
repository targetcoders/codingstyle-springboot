package com.targetcoders.springbootcodingstyle.commandhistory;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CommandHistoryService {

  private final CommandHistoryRepository repository;

  public void save(CommandHistory commandHistory) {
    repository.save(commandHistory);
  }
}
