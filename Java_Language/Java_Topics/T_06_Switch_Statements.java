package Java_Language.Java_Topics;

import java.util.Scanner;

public class T_06_Switch_Statements {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter A Colour :- Red, Yellow, Green");
        String color = in.next();
        in.close();

        // Todo :- Old Syntax For Switch Statements.
        switch (color) {
            case "Red":
                System.out.println("It's A Red Apple");
                break;

            case "Yellow":
                System.out.println("It's A Yellow Banana");
                break;

            case "Green":
                System.out.println("It's A Green Watermelon");
                break;

            default:
                System.out.println("Not Avalible");
        }

        // New Syntax For Switch Statements.
        switch (color) {
            case "Red" -> System.out.println("It's A Red Apple");
            case "Yellow" -> System.out.println("It's A Yellow Banana");
            case "Green" -> System.out.println("It's A Green Watermelon");
            default -> System.out.println("Not Avalible");
        }
    }
}
