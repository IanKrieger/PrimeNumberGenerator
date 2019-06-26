package app;

import impl.PrimeNumberGenImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberGenApp {

    private PrimeNumberGenImpl primeNumberGen = new PrimeNumberGenImpl();

    public static void main(String[] args) {
        PrimeNumberGenApp app = new PrimeNumberGenApp();
        app.run();
    }

    private void run() {

        boolean running = true;

        while (running) {

            try (BufferedReader inp = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("Do you want to generate or check a prime number? (generate[g]/check[c]): ");
                String mode = inp.readLine();

                if (mode.equalsIgnoreCase("check") || mode.equalsIgnoreCase("c")) {

                    System.out.println("Input a number to check: ");
                    int num = Integer.valueOf(inp.readLine());

                    boolean isPrime = primeNumberGen.isPrime(num);
                    System.out.println(isPrime ? "Number " + num + " is prime!" : "Number " + num + " is not prime");

                } else if (mode.equalsIgnoreCase("generate") || mode.equalsIgnoreCase("g")) {

                    System.out.println("Input the start of the range you want to generate: ");
                    int startPrime = Integer.valueOf(inp.readLine());

                    System.out.println("Input the end of the range you want to generate: ");
                    int endPrime = Integer.valueOf(inp.readLine());

                    System.out.println("The prime numbers between " + startPrime +
                            " and " + endPrime + " are:\n");

                    primeNumberGen.generate(startPrime, endPrime).forEach(System.out::println);

                } else {
                    System.out.println("The option to generate or check a prime number was not chosen!");
                }

                System.out.println("Do you want to check/generate more prime numbers? (y/n): ");
                String cont = inp.readLine();

                if (cont.equalsIgnoreCase("n") || cont.equalsIgnoreCase("no")) {
                    running = false;
                } else {
                    inp.reset();
                }

            } catch (IOException e) {
                System.out.println("Unable to get input from user. Exception message: " + e.getMessage());
            }
        }

    }

}