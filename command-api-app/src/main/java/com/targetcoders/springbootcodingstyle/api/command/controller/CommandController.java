package com.targetcoders.springbootcodingstyle.api.command.controller;

import com.targetcoders.springbootcodingstyle.command.CommandRunner;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/commands")
public class CommandController {

  private final CommandRunner commandRunner;

  @PostMapping("/{symbol}")
  public String command(@PathVariable("symbol") String symbol, @RequestBody String data) {
    return commandRunner.run(symbol, data);
  }
}
