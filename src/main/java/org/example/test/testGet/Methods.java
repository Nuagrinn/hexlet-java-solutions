package org.example.test.testGet;

import org.apache.commons.lang3.ArrayUtils;

public class Methods {
    private static String implementation = "right";

    private static String right(String[] strings, int index, String defaultValue) {
        return ArrayUtils.get(strings, index, defaultValue);
    }

    private static String wrong1(String[] strings, int index, String defaultValue) {
        if (index >= strings.length) {
            return "another default value";
        }
        return ArrayUtils.get(strings, index, defaultValue);
    }

    private static String wrong2(String[] strings, int index, String defaultValue) {
        if (index < 0) {
            return "another default value";
        }
        return ArrayUtils.get(strings, index, defaultValue);
    }

    private static String wrong3(String[] strings, int index, String defaultValue) {
        if (ArrayUtils.isEmpty(strings) || index < 0 || index >= strings.length) {
            return defaultValue;
        }
        return "You shall not pass! :-)";
    }

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static String get(String[] strings, int index, String defaultValue) {
        return switch (implementation) {
            case "wrong1" -> wrong1(strings, index, defaultValue);
            case "wrong2" -> wrong2(strings, index, defaultValue);
            case "wrong3" -> wrong3(strings, index, defaultValue);
            default -> right(strings, index, defaultValue);
        };
    }
}
