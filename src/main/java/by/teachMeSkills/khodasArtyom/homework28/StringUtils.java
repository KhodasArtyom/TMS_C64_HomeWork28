package by.teachMeSkills.khodasArtyom.homework28;

import java.util.Arrays;

import static java.lang.Character.isWhitespace;

public class StringUtils {


    public static void print(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void println(char[] array) {
        print(array);
        System.out.println();

    }
    //

    public static boolean isBlank(char[] array) {

        for (int i = 0; i < array.length; i++) {
            if (!Character.isWhitespace(array[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRussian(char[] chars) {

        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] < 'А' || chars[i] > 'я') && chars[i] != 'Ё' && chars[i] != 'ё') {
                return false; //
            }
        }
        return true;
    }

    public static boolean contains(char[] array, char[] subArray) {
        if (array.length == 0 || subArray.length == 0 || subArray.length > array.length) {
            throw new IllegalArgumentException("Неверно заданные параметры");
        }

        for (int i = 0; i < array.length - 1; i++) {
            int sum = 0;
            for (int j = 0; j < subArray.length; j++) {
                if (array[i + j] != subArray[j]) {
                    break;
                } else {
                    sum++;
                }
            }
            if (sum == subArray.length) return true;
        }
        return false;
    }


    public static int parsInt(char[] number) {
        int sum = 0;

        int zeroASCII = '0';//48
        for (int i = 0; i < number.length; i++) {
            if (number[i] < '0' || number[i] > '9') {
                throw new IllegalArgumentException("Неверно введенные символы");
            }
            int tmpAscii = number[i];
            sum = (sum * 10) + (tmpAscii - zeroASCII);
        }
        return sum;
    }

}





