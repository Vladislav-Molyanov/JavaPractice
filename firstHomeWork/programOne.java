package practice.firstHomeWork;
import java.util.Scanner;

// Task_1.
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. 
// Затем вводятся 2 числа из этого диапазона. 
// Используя данные из массива найдите их кубы.

// Sample Input:
// 8
// 11

// Sample Output:
// 512
// 1331

public class programOne {
    public static void main(String[] args) {
        double[] cubes = new double[1000];
        double start_num = 1;
        for (int i = 0; i < cubes.length; i++) {
            cubes[i] = Math.pow(start_num,3);
            start_num++;
            System.out.println(cubes[i]);
        }

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int num_one = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int num_two = iScanner.nextInt();

        System.out.println("Куб первого числа = " + cubes[num_one - 1]);
        System.out.println("Куб второго числа = " + cubes[num_two - 1]);
    }
}
