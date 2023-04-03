package practice.secondHomeWork;

import java.util.Scanner;

// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
public class programZero {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Какие драгоценные камни хотите найти: ");
        String jew = iScanner.nextLine();

        System.out.println("Куча обычных камней: ");
        String ston = iScanner.nextLine();
        
        
        int [] count = new int [128]; 
        for (int i = 0; i < ston.length(); i++) {
            count[ston.charAt(i)]++;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < jew.length(); i++) {
            char jewel = jew.charAt(i);
            if (count[jewel] > 0) {
                result.append(jewel).append(count[jewel]);
            }
        }
        
        
         System.out.printf("%s",result.toString());


    }
    
    
}
