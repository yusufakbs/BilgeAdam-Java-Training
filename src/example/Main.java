package example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Lütfen bir tamsayı girin: ");
            while (!sc.hasNextInt()) {
                System.out.println("Geçerli bir tamsayı giriniz.");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);

        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.primeNumberCheck(number);
    }
}
