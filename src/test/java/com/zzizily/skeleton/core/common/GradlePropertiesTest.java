package com.zzizily.skeleton.core.common;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Slf4j
@DisplayName("Gradle Properties")
class GradlePropertiesTest {

  @Test
  @Order(2)
  @DisplayName("getProperty equals")
  void getPropertyEquals() {
    assertEquals("5.6.2", GradleProperties.getProperty("gradleVersion"));
  }

  @Test
  @Order(1)
  @DisplayName("getProperty not equals")
  void getPropertyNotEquals() {
    assertNotEquals("5.6.2", GradleProperties.getProperty("gradleVersion"));
  }
}
