package by.teachMeSkills.khodasArtyom.homework28;

import java.util.Scanner;

public class HomeWork9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбер задачу из списка, чтобы посомтреть ее реализацю или нажмите 0, чтобы выйти");
        System.out.print("Task2\n" +
                "Task3\n" +
                "Task4\n" +
                "Task5\n" + "\n");
        while (scanner.hasNextInt()) {
            int chooseButton = scanner.nextInt();
            switch (chooseButton) {
                case 1-> {
                    System.out.print("Введите строку" + "\n");
                    StringUtils.print(ArrayUtil.getCharArray());
                    System.out.println();
                    System.out.println("Введте еще одну строку");
                    StringUtils.println(ArrayUtil.getCharArray());
                }
                case 2 -> {
                    System.out.println("Введите строку");
                    char[] string = ArrayUtil.getCharArray();
                    System.out.println("Проверка. Пустой ли ваш массив");
                    boolean resultTask1 = StringUtils.isBlank(string);
                    System.out.println(resultTask1);
                }
                case 3 -> {
                    System.out.println("Проверка. Состоит ли ваш массив только из букв русского алфавита");
                    System.out.println("Введите строку\n");
                    char[] string2 = ArrayUtil.getCharArray();
                    boolean resultTask3 = StringUtils.isRussian(string2);
                    System.out.println(resultTask3);
                }
                case 4 -> {
                    System.out.println("Проверка. Является ли 2-ой массив подмасивом 1-го");
                    System.out.println("Введите массив-строку № 1\n");
                    char[] mainArray = ArrayUtil.getCharArray();
                    System.out.println("Введите массив - строку № 2\n");
                    char[] subArray = ArrayUtil.getCharArray();
                    System.out.println("Результат");
                    boolean resultTask4 = StringUtils.contains(mainArray, subArray);
                    System.out.println(resultTask4);
                }
                case 5 -> {
                    System.out.println("Перевод из массива символов в число типа int");
                    System.out.println("Введите числа");
                    char[] arrayOfNumbers = ArrayUtil.getCharArray();
                    System.out.println("Результат");
                    int result = StringUtils.parsInt(arrayOfNumbers);
                    System.out.println(result);
                }
                case 0 -> {
                    System.out.println("Спасибо, что воспользовалсь программой. До свидания");
                    return;
                }
            }
        }
    }
}