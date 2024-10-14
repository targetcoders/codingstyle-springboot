package com.targetcoders.springbootcodingstyle.command.echoupper;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EchoUpperCommandTest {

  @Test
  void name() {
    EchoUpperCommand sut = EchoUpperCommand.create(null);

    String result = sut.name();

    Assertions.assertThat(result).isEqualTo("echoUpper");
  }

  @Test
  void data_null() {
    EchoUpperCommand sut = EchoUpperCommand.create(null);

    String result = sut.run();

    Assertions.assertThat(result).isEmpty();
  }

  @Test
  void data_empty() {
    EchoUpperCommand sut = EchoUpperCommand.create("");

    String result = sut.run();

    Assertions.assertThat(result).isEmpty();
  }

  @Test
  void dataLength_1() {
    EchoUpperCommand sut = EchoUpperCommand.create("a");

    String result = sut.run();

    Assertions.assertThat(result).isEqualTo("A");
  }

  @Test
  void dataLength_2OrMore() {
    EchoUpperCommand sut = EchoUpperCommand.create("Green Neuron");

    String result = sut.run();

    Assertions.assertThat(result).isEqualTo("GREEN NEURON");
  }
}
