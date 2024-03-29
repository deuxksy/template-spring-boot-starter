package com.zzizily.skeleton.core.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class CommandConfig implements CommandLineRunner {

  @Value("${spring.application.name}")
  private String name;

  @Value("${spring.profiles.active}")
  private String profiles;

  @Override
  public void run(String... args) {
    log.debug("{}-{}", name, profiles);
  }
}
