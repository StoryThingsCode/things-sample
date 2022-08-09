package com.storythings.sample.common.util;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.map.MapBuilder;

public class BeanGenerator {

    public static <T> T create(Class<T> clazz, MapBuilder builder){
        return BeanUtil.mapToBean(builder.build(), clazz, true);
    }

}
