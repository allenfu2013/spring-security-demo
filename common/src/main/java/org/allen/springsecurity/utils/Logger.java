package org.allen.springsecurity.utils;

public class Logger {

    public static void info(Object obj, String msg) {
        info(obj.getClass(), msg);
    }

    public static void info(Class clazz, String msg) {
        org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(clazz);
        logger.info(msg);
    }
}
