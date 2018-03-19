import java.util.Scanner;

public class Prime100 {
    public static void main(String[] args) {

        int number;
        for (number = 3; number < 100; number++) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }


            if (check) {
                System.out.print(number + " ");
            }

        }
    }
}
