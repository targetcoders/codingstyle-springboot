package com.targetcoders.springbootcodingstyle.api;

import lombok.Getter;

@Getter
public class ResponseErrorDto {

  private final Integer status;
  private final String errorCode;
  private final String message;

  public ResponseErrorDto(Integer status, String errorCode, String message) {
    this.status = status;
    this.errorCode = errorCode;
    this.message = message;
  }

  public static ResponseErrorDto create(Integer status, String errorCode, String message) {
    return new ResponseErrorDto(status, errorCode, message);
  }
}
