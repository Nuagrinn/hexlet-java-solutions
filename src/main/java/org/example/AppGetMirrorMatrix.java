package org.example;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class AppGetMirrorMatrix {

    // BEGIN (write your solution here)
    public static int[][] getMirrorMatrix(int[][] matrix) {
        //Создаем копию исходного массива
        var mirrorMatrix = Arrays.copyOf(matrix, matrix.length);
        //Построчно зеркалим каждую из строк массива
        for (var subArray : matrix) {
            AppGetMirrorMatrix.mirrorHalfOfMatrix(subArray);
        }

        return mirrorMatrix;
    }

    public static void mirrorHalfOfMatrix(int[] subArray) {
        //Создаем массив из левой половины строки изначального массива
        var halfSubArray = Arrays.copyOf(subArray, subArray.length / 2);
        //Зеркалим полученную половину
        ArrayUtils.reverse(halfSubArray);
        //Заменяем правую половину на отзеркаленную левую половину
        System.arraycopy(halfSubArray, 0, subArray, subArray.length / 2, halfSubArray.length);
    }
    // END

}
