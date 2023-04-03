import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            String a;
            final int NUM = 42;
            String word = "Hello, World!";
            a = (NUM + word);
            System.out.println(NUM + a + word);
            //Добавить только 1 условную конструкцию, которая бы выводила на экран следующее: если значение константы “NUM” меньше нуля - “Вы сохранили отрицательное число”, если же значение больше нуля - “Вы сохранили положительное число”, иначе - “Вы сохранили ноль”
            if (NUM < 0) {
                System.out.println("Вы сохранили отрицательное число");
            } else if (NUM > 0) {
                System.out.println("Вы сохранили положительное число");
            } else {
                System.out.println("Вы сохранили ноль");
            }

            // 7 Сделать так, чтобы программа выводила в консоль строку “Введите ваше имя:”.
            System.out.println("Введите ваше имя:");

            // 8 Затем считывала имя пользователя, введенное с клавиатуры.
            import java.util.Scanner;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите ваше имя:");
            String name = scanner.nextLine();

            //И в конце здоровалась с пользователем по имени которое вы ввели с клавиатуры.
            System.out.println("Здравствуйте, " + name + "!");


        }
    }

