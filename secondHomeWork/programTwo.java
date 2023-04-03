import java.lang.reflect.Array;
import java.util.Scanner;

public class programTwo {
//     На первой строке записывается натуральное число n - количество строчек в книге. 
//     Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов, 
//     на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, 
//     на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1. 
//     Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. 
//     Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

//     Выходные данные
//     Замените все продукты в поваренной книге Васи и выведите их построчно на экран. 
//     На окончания не обращайте внимание. ВАЖНО!!! Если продукт, 
//     который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!

// Sample Input:

// 2
// Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. 
// Посыпьте измельчённый арахис на мороженое.
// Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
// 3
// арахис - колбаса
// клубника - вишня
// сгущенка - молоко
// Sample Output:

// Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. 
// Посыпьте измельчённый колбаса на мороженое.
// Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.




    public static void main(String[] arg) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите количество строк в книге:");
        int line = iScanner.nextInt(); // Колличество строк в книге
        iScanner.nextLine();

        String [] linesBook = new String[line];
        for (int i = 0; i < linesBook.length; i++) {
            System.out.println("Рецепт");
            linesBook[i] = iScanner.nextLine();
        }

        System.out.println("Введите количество продуктов");
        int products = iScanner.nextInt();
        iScanner.nextLine();
        String [] listProducts = new String[products];
        for (int i = 0; i < listProducts.length; i++) {
            System.out.println("Введите название продуктов: ");
            listProducts[i] = iScanner.nextLine();
        }

        for (int i = 0; i < listProducts.length; i++) {
            String [] array = listProducts[i].split(" - ");
            for (int j = 0; j < linesBook.length; j++) {
                linesBook[j] = linesBook[j].replace(array[0], array[1]);
                String from = array[0].substring(0,1).toUpperCase()+array[0].substring(1);
                String to = array[1].substring(0,1).toUpperCase()+array[1].substring(1);
                linesBook[j] = linesBook[j].replace(from,to);
            }
        }
        
        for (int i = 0; i < linesBook.length; i++) {
            System.out.println(linesBook[i]);
        }


    }
}
