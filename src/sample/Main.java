package sample;

import javafx.application.Application;
import javafx.stage.Stage;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main  {

    private int maxNumber = 10;
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();

    private int right = 0;
    private int wrong = 0;

    public static void main (String... args) {
        new Main().run();
    }

    private void run() {

        final int a = random.nextInt(maxNumber);
        final int b = random.nextInt(maxNumber);

        final int type = random.nextInt(4);

        switch (type) {
            case 0:
                add(a, b);
                break;
            case 1:
                subtract(a, b);
                break;
            case 2:
                multiply(a, b);
                break;
            case 3:
                divide(a, b);
                break;
        }




    }

    private void add(final int a, final int b) {
        final int expected = a + b;

        final float answer = askQuestion(a + " + " + b + " = ");

        checkResult(expected, answer);
    }

    private void subtract(final int a, final int b) {
        final int expected = a - b;

        final float answer = askQuestion(a + " - " + b + " = ");

        checkResult(expected, answer);
    }

    private void multiply(final int a, final int b) {
        final int expected = a * b;

        final float answer = askQuestion(a + " * " + b + " = ");

        checkResult(expected, answer);
    }

    private void divide(final int a, final int b) {
        final float expected = a / b;

        final float answer = askQuestion(a + " / " + b + " = ");

        checkResult(expected, answer);
    }

    private int askQuestion(final String question) {
        System.out.print(question);

        return (int) in.nextFloat();
    }

    private void checkResult(final float expected, final float answer) {
        if (expected == answer) {
            System.out.println("Correct answer! Keep going!");
            right++;
        } else {
            System.out.println("WROOONG! COME ON!!!");
            wrong++;
        }
    }
}
