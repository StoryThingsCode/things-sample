package com.storythings.sample.common.util;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.StrUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CommonUtil {

    public static boolean isEmpty(Object obj){
        if(obj == null){
            return true;
        }
        if(obj instanceof String){
            if(StrUtil.equals("", Convert.toStr(obj, "").trim())){
                return true;
            }
        }
        if(obj instanceof List){
            if(((List) obj).size() == 0){
                return true;
            }
        }
        if(obj instanceof Map){
            if(((Map) obj).size() == 0){
                return true;
            }
        }
        if(obj instanceof Set){
            if(((Set) obj).size() == 0){
                return true;
            }
        }
        if(obj instanceof String[]){
            if(((String[]) obj).length == 0){
                return true;
            }
        }
        if(obj instanceof int[]){
            if(((int[]) obj).length == 0){
                return true;
            }
        }
        if(obj instanceof long[]){
            if(((long[]) obj).length == 0){
                return true;
            }
        }
        if(obj instanceof Object[]){
            if(((Object[]) obj).length == 0){
                return true;
            }
        }
        return false;
    }

    public static boolean isNotEmpty(Object obj){
        return !isEmpty(obj);
    }

}
