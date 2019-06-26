package app;

import impl.PrimeNumberGenImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;

public class PrimeNumberGenApp {

    private PrimeNumberGenImpl primeNumberGen = new PrimeNumberGenImpl();

    public static void main(String[] args) throws IOException {
        PrimeNumberGenApp app = new PrimeNumberGenApp();
        app.run();
    }

    private void run() throws IOException {

        boolean running = true;

        try (BufferedReader inp = new BufferedReader(new InputStreamReader(System.in))) {

            while (running) {

                System.out.println("Do you want to generate or check a prime number? (generate[g]/check[c]): \n");
                String mode = inp.readLine();

                if (mode.equalsIgnoreCase("check") || mode.equalsIgnoreCase("c")) {

                    System.out.println("Input a number to check: ");
                    int num = Integer.valueOf(inp.readLine());

                    boolean isPrime = primeNumberGen.isPrime(num);
                    System.out.println(isPrime ? "\nNumber " + num + " is prime!" : "Number " + num + " is not prime");

                } else if (mode.equalsIgnoreCase("generate") || mode.equalsIgnoreCase("g")) {

                    System.out.println("Input the start of the range you want to generate: ");
                    int startPrime = Integer.valueOf(inp.readLine());

                    System.out.println("Input the end of the range you want to generate: ");
                    int endPrime = Integer.valueOf(inp.readLine());

                    System.out.println("\nThe prime numbers between " + startPrime +
                            " and " + endPrime + " are:\n");

                    List<Integer> primes = primeNumberGen.generate(startPrime, endPrime);

                    Collections.sort(primes);

                    primes.forEach(item -> System.out.print(item + " "));

                } else {
                    System.out.println("The option to generate or check a prime number was not chosen!");
                }

                System.out.println("\n\nDo you want to check/generate more prime numbers? (y/n): ");
                String cont = inp.readLine();

                if (cont.equalsIgnoreCase("n") || cont.equalsIgnoreCase("no")) {
                    running = false;
                } else {
                    inp.mark(1);
                    inp.reset();
                }
            }

        }
    }
}
