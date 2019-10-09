package com.zzizily.skeleton.core.common;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Slf4j
public class GradleProperties {

  private static Properties properties = new Properties();

  static {
    try {
      properties.load(new FileInputStream("gradle.properties"));
    } catch (IOException e) {
      log.error("{}", e.getMessage());
    }
  }

  public static String getProperty(String key) {
    return properties.getProperty(key);
  }

}
