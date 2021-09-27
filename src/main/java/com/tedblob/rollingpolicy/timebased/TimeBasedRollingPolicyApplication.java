package com.tedblob.rollingpolicy.timebased;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TimeBasedRollingPolicyApplication {
	private static final Logger logger = LoggerFactory.getLogger(TimeBasedRollingPolicyApplication.class);

	public static void main(String[] args) {
		logger.debug("SpringBootApplication main START");
		SpringApplication.run(TimeBasedRollingPolicyApplication.class, args);
		logger.debug("SpringBootApplication main method END");
	}

}
