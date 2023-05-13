package com.notdevinclark.bot;

import java.time.LocalDate;
import java.util.Scanner;

public class ChatBot {
    Scanner scanner;
    final private String botName;
    final private int birthYear;

    public ChatBot() {
        this.botName = "Chatty";
        this.birthYear = LocalDate.now().getYear();
        this.scanner = new Scanner(System.in);
    }

    public void greeting() {
        System.out.println("Hello! My name is " + this.botName + ".");
        System.out.println("I was created in " + this.birthYear + ".");
    }

    public void askForName() {
        System.out.println("Please, remind me your name.");
        String userName = scanner.next();
        System.out.println("What a great name you have, " + userName + "!");
    }

    public void ageGame() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        int yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + yourAge + " that's a good time to start programming!");
    }

    public void countToAnyNumber() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int numberToCountTowards = scanner.nextInt();

        for (int i = 0; i <= numberToCountTowards; i++) {
            System.out.printf("%d!%n", i);
        }
    }

    public void multipleChoiceTest() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        boolean questionUnanswered = true;

        while(questionUnanswered) {
            int answer = scanner.nextInt();

            if (answer == 2) {
                questionUnanswered = false;
                continue;
            }

            System.out.println("Please, try again.");
        }

        System.out.println("Congratulations, have a nice day!");
    }

    public void shutDown() {
        scanner.close();
    }
}
