package com.environment.variables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnvironmentVariablesApplication {

    Logger log = LoggerFactory.getLogger(EnvironmentVariablesApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(EnvironmentVariablesApplication.class, args);
    }

}
