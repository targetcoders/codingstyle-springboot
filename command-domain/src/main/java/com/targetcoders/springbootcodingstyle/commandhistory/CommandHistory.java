package com.targetcoders.springbootcodingstyle.commandhistory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Getter
@NoArgsConstructor
public class CommandHistory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "command_history_id")
  private Long id;

  @Column(name = "symbol")
  private String symbol;

  @Column(name = "data")
  private String data;

  @Column(name = "result")
  private String result;

  @CreationTimestamp
  @Column(name = "create_date")
  private LocalDateTime createDate;

  public CommandHistory(String symbol, String data, String result) {
    this.symbol = symbol;
    this.data = data;
    this.result = result;
  }

  public static CommandHistory create(String symbol, String data, String result) {
    return new CommandHistory(symbol, data, result);
  }
}
