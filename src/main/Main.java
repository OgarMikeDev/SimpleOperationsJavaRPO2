package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         /*
        Кирилл.
        Написать метод, который принимает строку и
        оставляет в ней только буквы и числа,
        удаляя все остальное.
        Возвращает получившуюся строку.
         */

        /*
        Максим Лихачёв.
        Написать метод для
        обработки кода, который получает два списка целых,
        заполненных случайными числами.
        Код формирует и возвращает новый список,
        содержащий элементы обоих списков без повторений.
         */

        /*
        Влад.
        Написать метод для
        обработки кода,
        который содержит один аргумент –
        строку и распечатать количество букв и цифр в ней.
         */
        System.out.println(printLettersAndNumbers("123zxc"));

        /*
        Дима.
        Написать метод, который работает со списком целых, заполненных случайными числами.
        Вам нужно сформировать и распечатать из нового списка:
        1) Минимальный элемент
        2) Максимальный элемент
        3) Число отрицательных элементов
        4) Число положительных элементов
        5) Число нулей
         */

        /*
        Сёма.
        Написать метод, который принимает два целых числа (границы диапазона),
        формирует список из чисел этого диапазона (включая границы)
        и возвращает сформировавшийся список.
         */

        /*
        Матвей.
        Решить следующую задачу с применением метода:
        Зарплата менеджера составляет 200$ + процент от продаж,
        продажи до 500$ — 3%,
        от 500 до 1000 — 5%,
        свыше 1000 — 8%.
        Метод принимает три аргумента,
        обозначающих уровень продаж для трех менеджеров.
        Определить их зарплату,
        определить лучшего менеджера,
        начислить ему премию 200$,
        вывести итоги в консоль.
         */

        /*
        Егор.
        Написать метод, который вычисляет площадь и периметр квадрата.
         */

        /*
        Глебушка.
        Написать метод, который принимает один аргумент –
        целое двухзначное число
        и выводит в консоль каждый его разряд
        на разных строках, а возвращает их сумму.
         */
    }

    //Кирилл
    public static String lettersAndNumbers(String text) {
        return "";
    }

    //Максим Лихачёв
    public static String listContainsElementsOtherLists(ArrayList<Integer> listRandomNumbersFirst, ArrayList<Integer> listRandomNumbersSecond) {
        return "";
    }

    //Влад
    public static String printLettersAndNumbers(String text) {
        int letterCount = 0;
        int digitCount = 0;

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        return "Количество букв: " + letterCount + "\nКоличество цифр: " + digitCount;
    }



    //Дима
    public static void printMaxAndMinAndCount(ArrayList<Integer> list) {

    }

    //Сёма
    public static ArrayList<Integer> lettersAndNumbers(int numberFirst, int numberSecond) {
        return new ArrayList<>();
    }

    //Матвей. Дописать 3 аргументы в первую строку метода и его реализовать
    public static void workWitchManagers() {
    }

    //Егор
    public static void getSquareAndPerimetr() {

    }

    //Глеб
    public static int getSquareAndPerimetr(int NumberTwoSybmol) {
        return 0;
    }
}
