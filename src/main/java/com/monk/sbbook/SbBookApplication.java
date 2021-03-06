package com.monk.sbbook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbBookApplication {
	private static Logger logger = LoggerFactory.getLogger(SbBookApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SbBookApplication.class, args);

		logger.info("【【【【【【定时任务分布式节点 - quartz-cluster-node-first 已启动】】】】】】");
	}
}
