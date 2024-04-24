package main;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         /* я дима я ни в чем не разбираюсь я тупой
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



    public static String listContainsElementsOtherLists(ArrayList<Integer> listRandomNumbersFirst, ArrayList<Integer> listRandomNumbersSecond) {
        List<Integer> list1 = generateRandomList(10);
        List<Integer> list2 = generateRandomList(10);
        List<Integer> result = combineLists(list1, list2);
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Combined List: " + result);

        return null;
    }
        public static List<Integer> generateRandomList(int size) {
            List<Integer> list = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                list.add(random.nextInt(100)); // Генерируем случайное число от 0 до 99
            }
            return list;
        }

        public static List<Integer> combineLists(List<Integer> list1, List<Integer> list2) {
            Set<Integer> set = new HashSet<>(list1); // Создаем множество, чтобы избежать повторений
            set.addAll(list2); // Добавляем все элементы из второго списка
            return new ArrayList<>(set); // Возвращаем новый список, содержащий элементы обоих списков без повторений
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
