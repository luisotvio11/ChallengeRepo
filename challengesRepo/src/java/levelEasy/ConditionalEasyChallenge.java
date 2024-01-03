package java.levelEasy;

import java.util.Scanner;

public class ConditionalEasyChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        boolean isOdd = number % 2 != 0;

        if (isOdd || (number >= 6) && (number <= 20)) {
            System.out.println("Weird");

        }
        else if (!isOdd && (number >= 2) && (number <= 5) ){

            System.out.println("Not Weird");

        }

        else {

            System.out.println("Not Weird");
        }
    }
}