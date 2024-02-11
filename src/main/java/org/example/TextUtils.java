package org.example;

import org.apache.commons.lang3.StringUtils;

public class TextUtils {

    public static int getWordsCount(String text) {

        if(!StringUtils.isBlank(text)) {
            String[] wrldsArr = text.trim().split(" ");
            return wrldsArr.length;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(getWordsCount(""));

    }
}
