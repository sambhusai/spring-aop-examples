package com.sambhu.examples.aop.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Application.
 *
 * <p>
 *     Properties are configured in the application.yml file.
 * </p>
 */

@ConfigurationProperties(prefix = "app")
public class AppProperties {

}
