package com.zzizily.skeleton;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
@Slf4j
public class SkeletonApplication {
  public static void main(String[] args) {
    run(SkeletonApplication.class, args);
  }

}
