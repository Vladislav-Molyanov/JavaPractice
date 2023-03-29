package practice.firstHomeWork;
import java.util.Scanner;
// Вводится число n, затем n чисел целых, по одному на каждой строке. 
// Затем вводится число, на которое нужно умножить все введённые выше числа. 
// Выведите на экран результат умножения построчно.

// Sample Input:

// 4
// 1
// 2
// 3
// 5
// 2
// Sample Output:

// 2
// 4
// 6
// 10

public class progromTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Какое количество чисел хотите ввести? - ");
        int listNumber[] = new int [scanner.nextInt()];

        for (int i = 0; i < listNumber.length; i++) {
            System.out.printf("Введите %d число: ",i+1);
            listNumber[i] = scanner.nextInt();
        }
        System.out.printf("На какое число перемножить эти числа ? - ");
        int multiplier = scanner.nextInt();

        for (int i = 0; i < listNumber.length; i++) {
            System.out.println(listNumber[i] * multiplier);
        }
    }
}
