package com.sambhu.examples.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author sambhu
 */
@SpringBootApplication
public class SpringAopExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopExamplesApplication.class, args);
	}
}
