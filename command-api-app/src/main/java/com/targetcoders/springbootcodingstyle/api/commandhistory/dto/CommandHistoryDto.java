package com.targetcoders.springbootcodingstyle.api.commandhistory.dto;

import com.targetcoders.springbootcodingstyle.commandhistory.CommandHistory;
import lombok.Data;

@Data
public class CommandHistoryDto {

  private final String symbol;
  private final String data;
  private final String result;
  private final String createDate;

  public CommandHistoryDto(String symbol, String data, String result, String createDate) {
    this.symbol = symbol;
    this.data = data;
    this.result = result;
    this.createDate = createDate;
  }

  public static CommandHistoryDto create(CommandHistory commandHistory) {
    return new CommandHistoryDto(commandHistory.getSymbol(), commandHistory.getData(),
        commandHistory.getResult(), commandHistory.getCreateDate().toString());
  }
}
