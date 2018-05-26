package com.ls;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 主程序开始
 */
@EnableAutoConfiguration
@MapperScan(basePackages="com.ls.dao")
@SpringBootApplication
//@SpringBootApplication(scanBasePackages = {"service","mapping","configuration","service.impl","dao","controller","entity","interceptor","utils"})
public class inner {

  public static void main(String[] args) {
	  SpringApplication.run(inner.class, args);
  }
}