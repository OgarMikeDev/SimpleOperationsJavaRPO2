package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        workWitchManagers(700, 900, 1100);
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
    public static String lettersAndNumbers(String text) {
        return "";
    }

    //Максим Лихачёв
    public static String listContainsElementsOtherLists(ArrayList<Integer> listRandomNumbersFirst, ArrayList<Integer> listRandomNumbersSecond) {
        return "";
    }

    //Влад
    public static void printLettersAndNumbers(String text) {

    }

    //Дима
    public static void printMaxAndMinAndCount(ArrayList<Integer> list) {

    }

    //Сёма
    public static ArrayList<Integer> lettersAndNumbers(int numberFirst, int numberSecond) {
        return new ArrayList<>();
    }

    //Матвей. Дописать 3 аргументы в первую строку метода и его реализовать
    public static void workWitchManagers(int salesManager1, int salesManager2, int salesManager3) {
        int salary1 = 200 + calculateCommission(salesManager1);
        int salary2 = 200 + calculateCommission(salesManager2);
        int salary3 = 200 + calculateCommission(salesManager3);

        System.out.println("Зарплата менеджера 1: " + salary1);
        System.out.println("Зарплата менеджера 2: " + salary2);
        System.out.println("Зарплата менеджера 3: " + salary3);

        int maxSalary = Math.max(salary1, Math.max(salary2, salary3));
        System.out.println("Зарплата лучшего менеджера: " + maxSalary);

        if (maxSalary == salary1) {
            System.out.println("Менеджер 1 получает бонус в размере 200$");
        } else if (maxSalary == salary2) {
            System.out.println("Менеджер 2 получает бонус в размере 200$");
        } else {
            System.out.println("Менеджер 3 получает бонус в размере 200$");
        }
    }

    public static int calculateCommission(int sales) {
        if (sales < 500) {
            return (int) (sales * 0.03);
        } else if (sales < 1000) {
            return (int) (sales * 0.05);
        } else {
            return (int) (sales * 0.08);
        }
    }


    //Егор
    public static void getSquareAndPerimetr() {

    }

    //Глеб
    public static int getSquareAndPerimetr(int NumberTwoSybmol) {
        return 0;
    }
}
