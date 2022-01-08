package com.bootiful.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;


@EnableAdminServer
@SpringBootApplication
public class BootifulAdminApplication {

  public static void main(String[] args) {
    SpringApplication.run(BootifulAdminApplication.class, args);
  }

}
