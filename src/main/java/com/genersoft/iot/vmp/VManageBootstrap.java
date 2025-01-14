package com.genersoft.iot.vmp;

import java.util.logging.LogManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class VManageBootstrap extends LogManager {
	public static void main(String[] args) {
		SpringApplication.run(VManageBootstrap.class, args);
	}

}
