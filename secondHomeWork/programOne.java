
import java.util.Scanner;
public class programOne {
// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”
    public static void main(String[] arg) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = iScanner.nextLine();
        int [] index = new int [line.length()];

        for (int i = 0; i < index.length; i++) {
            while (true) {
                System.out.printf("Введите значение %d элемента: ",i+1);
                int print = iScanner.nextInt();
                    if (print > 0 && print <=line.length() ) {
                        index[i] = print;
                        break;
                    }
                System.out.printf("Введите число в диапозоне от %d до %d\n",1,line.length());
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            result.append(line.charAt(index[i]-1));
        }

        System.out.println(result.toString());
        iScanner.close();
    }
}
