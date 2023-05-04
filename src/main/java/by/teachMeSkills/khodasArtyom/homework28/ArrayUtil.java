package by.teachMeSkills.khodasArtyom.homework28;

import java.util.Scanner;

public class ArrayUtil {
    public static char[] getCharArray() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] array = str.toCharArray();

        return array;
    }
}


