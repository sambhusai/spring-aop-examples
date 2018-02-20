package com.sambhu.examples.aop.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author sambhu
 * Created by work on 2/28/16.
 */
public abstract class JsonUtils {

    private static final String DEFAULT_JSON_DATE_FORMAT = "yyyy-MM-dd hh:mm:ss a z";

    private static Gson gson = new GsonBuilder().setDateFormat(DEFAULT_JSON_DATE_FORMAT).create();;

    public static String toJson(Object object){
        return gson.toJson(object);
    }
}
