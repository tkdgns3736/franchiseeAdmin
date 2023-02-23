package com.pinple.store;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FranchiseeAdminApplication {
		private static Logger log = LoggerFactory.getLogger(FranchiseeAdminApplication.class);
	public static void main(String[] args) {
	
		SpringApplication.run(FranchiseeAdminApplication.class, args);
	}

}
