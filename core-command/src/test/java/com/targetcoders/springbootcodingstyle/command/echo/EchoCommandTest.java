package com.targetcoders.springbootcodingstyle.command.echo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EchoCommandTest {

  @Test
  void name() {
    EchoCommand sut = EchoCommand.create(null);

    String result = sut.name();

    Assertions.assertThat(result).isEqualTo("echo");
  }

  @Test
  void data_Null() {
    EchoCommand sut = EchoCommand.create(null);

    String result = sut.run();

    Assertions.assertThat(result).isEmpty();
  }

  @Test
  void data_Empty() {
    EchoCommand sut = EchoCommand.create("");

    String result = sut.run();

    Assertions.assertThat(result).isEmpty();
  }

  @Test
  void dataLength_1() {
    EchoCommand sut = EchoCommand.create(" ");

    String result = sut.run();

    Assertions.assertThat(result).isEqualTo(" ");
  }

  @Test
  void dataLength_2OrMore() {
    EchoCommand sut = EchoCommand.create("Green Neuron");

    String result = sut.run();

    Assertions.assertThat(result).isEqualTo("Green Neuron");
  }
}
