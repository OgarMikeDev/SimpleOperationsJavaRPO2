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




        public static String printLettersAndNumbers(String text) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isLetterOrDigit(ch)) {
                    builder.append(ch);
                }
            }
            return builder.toString();
        }

    //Максим Лихачёв
    public static String listContainsElementsOtherLists(ArrayList<Integer> listRandomNumbersFirst, ArrayList<Integer> listRandomNumbersSecond) {
        return "";
    }

    //Влад


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
    public static int getNumberTwoSybmol(int NumberTwoSybmol) {
        return 0;
    }


    public static void aske(String txt) {
        for (int i = 0; i < txt.length(); i++) {
            Character ch = (char) txt.charAt(i);
            int c = ch.hashCode();
            if (c >= 48 && c <= 57 || c >= 65 && c <= 90 || c >= 97 && c <= 122) {
                System.out.print(ch);
            }
        }
    }
}