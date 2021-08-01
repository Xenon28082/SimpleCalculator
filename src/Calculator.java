import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("This is simple calculator that can execute simple arithmetical operations");
        System.out.println("Menu:\nEnter \"1\" to add\nEnter \"2\" to substract\nEnter \"3\" to multiply\nEnter \"4\" to divide\nEnter \"5\" to power\nEnter \"6\" to get root\nEnter \"e\" to exit\nEnter \"m\" to show menu");

        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);

        Arythmetics metrics = new Arythmetics();

        HashSet set = new HashSet(Arrays.asList('1', '2', '3', '4', '5', '6', 'e', 'm'));

        while (input != 'e') {

            if (set.contains(input)) {
                try {


                    System.out.println("Input first number");
                    double first = sc.nextDouble();
                    metrics.setFirst(first);
                    System.out.println("Input second number");
                    double second = sc.nextDouble();
                    metrics.setSecond(second);
                    switch (input) {
                        case '1':
                            System.out.printf("Result: %.5f\n", metrics.sum());
                            break;
                        case '2':
                            System.out.printf("Result: %.5f\n", metrics.sub());
                            break;
                        case '3':
                            System.out.printf("Result: %.5f\n", metrics.multiply());
                            break;
                        case '4':
                            System.out.printf("Result: %.5f\n", metrics.divide());
                            break;
                        case '5':
                            System.out.printf("Result: %.5f\n", metrics.power());
                            break;
                        case '6':
                            System.out.printf("Result: %.5f\n", metrics.square());
                            break;
                        case 'e':
                            System.out.println("Bye");
                            break;
                        case 'm':
                            System.out.println("Menu:\nEnter \"+\" to add\nEnter \"-\" to substract\nEnter \"*\" to multiply\nEnter \"/\" to divide\nEnter \"e\" to exit\nEnter \"m\" to show menu");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error input, try again; To enter a double value number use delimer ','");
                }
            } else {
                System.out.println("Error input, try again");
            }


            System.out.println("Make choise");
            input = sc.next().charAt(0);
        }
    }

}
