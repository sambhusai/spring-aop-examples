package com.sambhu.examples.aop.web.dto;

import ch.qos.logback.classic.Logger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sambhu.examples.aop.utils.JsonUtils;

/**
 * @author sambhu
 * Created by work on 2/28/16.
 */
public class LoggerDto {

    private String name;
    private String level;

    @JsonCreator
    public LoggerDto() {
    }

    public LoggerDto(Logger logger) {
        this.name = logger.getName();
        this.level = logger.getEffectiveLevel().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
       return JsonUtils.toJson(this);
    }
}
