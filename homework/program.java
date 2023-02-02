package homework;

import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

import java.sql.SQLInvalidAuthorizationSpecException;

//Написать программу вычисления n-ого треугольного числа. 
public class program {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int userNumber = numFromUser("Введите натуральное число");
        System.out.printf("Вы ввели число %d, треугольное число будет равно %d ",userNumber, caclNumTriangle(userNumber));
    }
    // Метод запрашивающий число у пользователя
    static int numFromUser (String arg) {
        int num = 0;
        do{
            System.out.print(arg);
            num = input.nextInt();
        } while (num < 0);
        return num;
    }
    //Метод расчитывает треугольное число
    static int caclNumTriangle (int num) {
        int number = num * (num + 1)/2;
        return number;
    }
}