import javax.management.BadAttributeValueExpException;
import javax.management.ValueExp;
import java.util.*;

public class Main {

    static  public Scanner in = new Scanner(System.in);

    // файл 1
    // Задача 1: Четное или нечетное число
    static void task1() {

        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("oval");
        }
    }
    // Задача 4: Сумма чисел от 1 до N
    static void task4() {
        int N = in.nextInt();
        int result = 0;
        for (int i = 0; i != N; ++i) {
            result += i;
        }
        System.out.println(result);
    }
    // Задача 7: Обратный порядок чисел
    static void task7() {
        int N = in.nextInt();
        for (int i = N; i != 0; --i) {
            System.out.printf("%d ", i);
        }
    }

    // Задача 10: Количество цифр в числе
    static void task10() {
        String str = Integer.toString(in.nextInt());
        System.out.println(str.length());
    }

    // Задача 13: Палиндром
    static void task13() {
        String str = in.next();
        if (Objects.equals(str, new StringBuilder(str).reverse().toString())) {
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }

    // Задача 16: Количество положительных и отрицательных чисел
    static void task16() {
        int size = in.nextInt();
        int[] arr = new int[size];
        int positive = 0;
        int negative = 0;
        int num = 0;
        for (int i = 0; i != size; ++i) {
            num = in.nextInt();
            arr[i] = num;
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }
        System.out.printf("положительные: %d\nотрицательные: %d", positive, negative);
    }

    // Задача 19: Перестановка слов в строке
    static void task19() {
        String[] arr = in.nextLine().split(" ");
        Collections.reverse(Arrays.asList(arr));
        System.out.print(String.join(" ", arr));
    }

    // Файл 2
    // 1. Функция для нахождения максимума
    static int task1_2(int a, int b) throws BadAttributeValueExpException {
        if (a == b) {
            throw new BadAttributeValueExpException("Quality numbers");
        }
        return Integer.max(a, b);
    }

    // 4. Проверка возраста
    static void task4_2(int age) throws IllegalArgumentException {
        if (0 > age || age > 150) {
            throw new IllegalArgumentException();
        }
    }

    // 7. Проверка массива на нули
    static void task7_2(final int[] arr) throws ElementExeption {
        boolean b = Arrays.stream(arr).noneMatch(x -> x == 0);
        System.out.print(Boolean.toString(b));
        if (!b) {
            throw new ElementExeption("В массиве есть нули");
        }
    }

    //10. Поиск элемента в массиве
    static void task10_2(final int[] arr, int num) throws ElementExeption {
        boolean b = Arrays.stream(arr).noneMatch(x -> x == num);
        if (b) {
            throw new ElementExeption("Нет такого элемента");
        }
    }

    // 13. Чтение элемента списка
    static int task13_2(final int[] arr, int num) throws IndexOutOfBoundsException {
        for (int i = 0; i != arr.length; ++i) {
            if (arr[i] == num) return i;
        }
        throw new IndexOutOfBoundsException();
    }

    // 16. Конкатенация строк
    static String task16_2(final String s1, final String s2) throws NullPointerException {
        if (s1 == null || s2 == null) {
            throw new NullPointerException();
        }
        return s1 + s2;
    }

    // 19. Конвертер температуры
    static double task19_2(double temp) throws ElementExeption {
        if (temp < -273) {
            throw new ElementExeption("Температура меньше абсолютного нуля");
        }

        return temp * 9.0 / 5.0 + 32.0;
    }

    public static void main(String[] args) throws BadAttributeValueExpException, IllegalArgumentException, ElementExeption {
        // System.out.print(task1_2(3, 4));
        // System.out.print(task13_2(new int[]{1, 2, 3, 4, 5, 0}, 3));
        //System.out.print(task16_2("one", null));
        System.out.print(task19_2(-300));
    }
}