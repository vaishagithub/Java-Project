import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        // Question 1
        System.out.println("1. Which language is used for Android development?");
        System.out.println("1. Java");
        System.out.println("2. HTML");
        System.out.println("3. CSS");
        System.out.println("4. SQL");

        System.out.print("Enter your answer: ");
        int answer1 = sc.nextInt();

        if (answer1 == 1) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which keyword is used to create a class in Java?");
        System.out.println("1. function");
        System.out.println("2. class");
        System.out.println("3. object");
        System.out.println("4. new");

        System.out.print("Enter your answer: ");
        int answer2 = sc.nextInt();

        if (answer2 == 2) {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which symbol is used for multiplication in Java?");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");

        System.out.print("Enter your answer: ");
        int answer3 = sc.nextInt();

        if (answer3 == 3) {
            score++;
        }

        // Final score
        System.out.println("\nQuiz Completed!");
        System.out.println("Your Score = " + score + "/3");

        sc.close();
    }
}