import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] weights = new int[]{1, 2, 3};
        double[] numbers = {1.57, 7.654, 9.986};
        int[] others = {1235, 987654, 654654, 321987};

        System.out.println("Задача 2");
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i < weights.length - 1) {
                System.out.print(" , ");
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(" , ");
            }
        }
        for (int i = 0; i < others.length; i++) {
            System.out.print(others[i]);
            if (i < others.length - 1) {
                if (i != 0)
                System.out.print(" ,");
            }
        }
        System.out.println();


        System.out.println("Задача 3");

        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i]);
            if (i < 0) {
                System.out.print(" ,");
            }
        }
        System.out.println();

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(" ,");

            }
        }
        System.out.println();

        for (int i = others.length - 1; i >= 0; i--) {
            System.out.print(others[i]);
            if (i > 0) {
                System.out.print(" ,");
            }
        }
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 == 1) {
                weights[i] = weights[i] + 1;
            }
            System.out.println(Arrays.toString(weights));
            break;

        }
    }


}





