package com.storythings.sample.common.util;

import cn.hutool.core.lang.UUID;

import java.text.*;
import java.util.Calendar;

public class IdGenerator {

    private static final FieldPosition POSITION = new FieldPosition(0);

    private static final Format FORMAT_DATE = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    private static final NumberFormat FORMAT_NUMERIC = new DecimalFormat("00");

    private static int seq = 0;

    private static final int MAX = 9;

    public static synchronized Long createSnowFlakeId(){
        return SnowFlakeGenerator.nextId();
    }

    public static synchronized String createUUID(){
        return createUUIDWithSymbol().replace("-", "");
    }

    public static synchronized String createUUIDWithSymbol(){
        return UUID.randomUUID().toString();
    }

    public static synchronized String create(){
        return create(24);
    }

    public static synchronized String create(int len){
        Calendar now = Calendar.getInstance();
        StringBuffer sb = new StringBuffer();
        FORMAT_DATE.format(now.getTime(), sb, POSITION);
        FORMAT_NUMERIC.format(seq, sb, POSITION);
        if (seq == MAX) {
            seq = 0;
        } else {
            seq++;
        }
        int numericLen = len - sb.length();
        return sb.append(RandomGenerator.numeric(numericLen)).toString();
    }

}
