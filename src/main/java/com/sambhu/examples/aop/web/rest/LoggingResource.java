package com.sambhu.examples.aop.web.rest;

/**
 * Created by work on 2/28/16.
 */

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import com.sambhu.examples.aop.web.dto.LoggerDto;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sambhu
 * Controller for view and managing Log Level at runtime.
 */
@RestController
@RequestMapping("/api")
public class LoggingResource {

    @RequestMapping(value = "/logs", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LoggerDto> getList(){
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        return loggerContext.getLoggerList().stream().map(LoggerDto::new).collect(Collectors.toList());
    }

    @RequestMapping(value = "/logs", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void changeLevel(@RequestBody LoggerDto loggerDto) {
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        loggerContext.getLogger(loggerDto.getName()).setLevel(Level.valueOf(loggerDto.getLevel()));
    }
}
