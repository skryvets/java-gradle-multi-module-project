package com.skryvets.utils;

public class Utils {

    private Utils() {}

    public static String capitalizeFirst(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
