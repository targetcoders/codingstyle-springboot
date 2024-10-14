package com.targetcoders.springbootcodingstyle.api.commandhistory.controller;

import com.targetcoders.springbootcodingstyle.api.commandhistory.dto.CommandHistoryDto;
import com.targetcoders.springbootcodingstyle.commandhistory.CommandHistoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@Transactional(readOnly = true)
@RequestMapping("/api/v1/command-histories")
public class CommandHistoryQueryController {

  private final CommandHistoryRepository commandHistoryRepository;

  @GetMapping
  public Page<CommandHistoryDto> commandHistories(Pageable pageable) {
    Page<CommandHistoryDto> result = commandHistoryRepository.findAll(pageable)
        .map(CommandHistoryDto::create);
    log.debug("pageable={}, commandHistories={}", pageable, result.getContent());
    return result;
  }
}
