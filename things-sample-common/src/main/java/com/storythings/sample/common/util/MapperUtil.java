package com.storythings.sample.common.util;

public class MapperUtil {

    public static boolean isEmpty(Object obj){
        return CommonUtil.isEmpty(obj);
    }

    public static boolean isNotEmpty(Object obj){
        return !isEmpty(obj);
    }

}
