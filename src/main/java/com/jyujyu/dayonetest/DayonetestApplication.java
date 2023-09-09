package com.jyujyu.dayonetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class DayonetestApplication {

  public static void main(String[] args) {
    SpringApplication.run(DayonetestApplication.class, args);
  }
}
