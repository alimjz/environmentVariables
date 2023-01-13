package com.environment.variables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigProperties implements CommandLineRunner {
    @Value("${ali.home}")
    private String javaHome;

    Logger log = LoggerFactory.getLogger(EnvironmentVariablesApplication.class);

    public String getJavaHome() {
        return javaHome;
    }

    public void setJavaHome(String javaHome) {
        this.javaHome = javaHome;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("The Java Home is : " + this.getJavaHome());
    }
}
