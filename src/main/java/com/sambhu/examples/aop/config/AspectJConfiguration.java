package com.sambhu.examples.aop.config;

import com.sambhu.examples.aop.aspects.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;

/**
 * Created by work on 2/28/16.
 */

@Configuration
@EnableAspectJAutoProxy
public class AspectJConfiguration {

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
