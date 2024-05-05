import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static void primeNumsSieveEratosthenes(int n) {

        boolean[] prime = new boolean[n+1];
        /// 0, 1, 2, 3, 4
        //Arrays.fill(prime, true);
        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        System.out.println();
        System.out.print("Prime Nums are: ");
        for (int p = 2; p <= n; p++) {
            if (prime[p])
                System.out.print(p + " ");
        }

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the upper lim: ");
        int upperLim;
        while (true) {
            try {
                upperLim = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                input.next();
                System.out.println();
                System.out.print("Invalid input. try again: ");
            }
        }


        primeNumsSieveEratosthenes(upperLim);
    }
}