package practice.firstHomeWork;

import java.util.Scanner;

// Реализовать простой калькулятор (+,-,=,*), только с целыми числами.
public class programThree {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int num_one = scanner.nextInt();

        System.out.printf("Какую операцию хотите использовать: '+','*','-','/': ");
        char ch = scanner.next().charAt(0);

        System.out.printf("Введите второе число: ");
        int num_two = scanner.nextInt();

        int result = 0;

        switch (ch) {
            case '+':
                result = num_one + num_two;
                System.out.printf("%d %c %d = %d\n",num_one,ch,num_two,result);
                break;
            
            case '*':
                result = num_one * num_two;
                System.out.printf("%d %c %d = %d\n",num_one,ch,num_two,result);
                break;


            case '-':
                result = num_one - num_two;
                System.out.printf("%d %c %d = %d\n",num_one,ch,num_two,result);
                break; 

            case '/':
                if (num_one == 0 || num_two == 0) {
                    System.out.println("На ноль делить нельзя");
                } else {
                    result = num_one / num_two;
                }
                
                System.out.printf("%d %c %d = %d\n",num_one,ch,num_two,result);
                break;
            default:
                break;
        }

    }
}
