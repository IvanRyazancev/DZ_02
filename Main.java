import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Написать калькулятор в ООП стиле(инкапсуляция, наследованеи. полиморфизм)
         */
        System.out.println("Введите первое число?");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println("Введите второе число?");
        double y = scanner.nextDouble();

        System.out.println("Введите что будем делать ( + | - | * | / ? ");
        Scanner scanner1 = new Scanner(System.in);
        String op = scanner1.nextLine();

        Numbers b = new Numbers(x, y);

        switch (op) {
            case "+" -> b.summa();
            case "-" -> b.subtraction();
            case "*" -> b.multiplication();
            case "/" -> b.division();
        }
    }
}