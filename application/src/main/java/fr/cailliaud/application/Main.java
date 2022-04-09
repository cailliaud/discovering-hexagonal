package fr.cailliaud.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "fr.cailliaud")
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class);
  }
}
