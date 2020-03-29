package com.qin.utils;

import java.util.UUID;

/**
 * @program: Mybatis-Study
 * @description:
 * @author: Qin
 * @date: 2020-03-29
 **/
public class UuidUtils {
    public static String get_uuid() {
        String string = UUID.randomUUID().toString();
        String newString = string.replaceAll("-", "");
        return newString;
    }
}
