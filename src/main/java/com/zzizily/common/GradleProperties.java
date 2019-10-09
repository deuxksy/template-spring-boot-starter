package com.zzizily.common;

import lombok.Builder;
import lombok.extern.java.Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Log
public class GradleProperties {

  private static Properties properties = new Properties();

  static {
    try {
      properties.load(new FileInputStream("gradle.properties"));
    } catch (IOException e) {
      log.severe(e.getMessage());
    }
  }

  public static String getProperty(String key) {
    return properties.getProperty(key);
  }


}
