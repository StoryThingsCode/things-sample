package com.storythings.sample.common.util;

import cn.hutool.core.util.RandomUtil;

import java.util.Random;

public class RandomGenerator {

    private static final String CHARACTER_LOWER = "abcdefghijklmnopqrstuvwxyz";

    private static final String CHARACTER_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static final String NUMERIC = "0123456789";

    private static final String SPECIAL = "!@#$%^&*";

    private static final int MODE_NUMERIC = 0;

    private static final int MODE_CHARACTER_LOWER = 1;

    private static final int MODE_CHARACTER_UPPER = 2;

    private static final int MODE_SPECIAL = 3;

    private static final int MODE_NUM_LOWER = 4;

    private static final int MODE_NUM_UPPER = 5;

    private static final int MODE_NUM_CHARACTER = 6;

    private static final int MODE_NUM_SPECIAL = 7;

    private static String createSource(int mode){
        switch (mode) {
            case MODE_NUMERIC:
                return NUMERIC;
            case MODE_CHARACTER_LOWER:
                return CHARACTER_LOWER;
            case MODE_CHARACTER_UPPER:
                return CHARACTER_UPPER;
            case MODE_SPECIAL:
                return SPECIAL;
            case MODE_NUM_LOWER:
                return NUMERIC + CHARACTER_LOWER;
            case MODE_NUM_UPPER:
                return NUMERIC + CHARACTER_UPPER;
            case MODE_NUM_CHARACTER:
                return NUMERIC + CHARACTER_LOWER + CHARACTER_UPPER;
            case MODE_NUM_SPECIAL:
                return NUMERIC + CHARACTER_LOWER + CHARACTER_UPPER + SPECIAL;
            default:
                return "";
        }
    }

    private static String random(String source, int length){
        return RandomUtil.randomString(source, length);
    }

    public static String random(int mode, int length){
        return random(createSource(mode), length);
    }

    public static synchronized String numeric(int length){
        return random(MODE_NUMERIC, length);
    }

    public static synchronized String lower(int length){
        return random(MODE_CHARACTER_LOWER, length);
    }

    public static synchronized String upper(int length){
        return random(MODE_CHARACTER_UPPER, length);
    }

    public static synchronized String character(int length){
        return random(MODE_NUM_CHARACTER, length);
    }

    public static synchronized String random(int length){
        return random(MODE_NUM_SPECIAL, length);
    }



}
