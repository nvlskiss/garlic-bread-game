import rooms.livingroom;

import java.util.Scanner;
import java.io.*;

public class game {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String ans = "yes";
        System.out.println("Hey, you made it!! Welcome to uhm... Let's call it " + ANSI_YELLOW + "Garlic Bread " +
                "Simulator 2021 " + ANSI_RESET + ":D\nWrite " + ANSI_YELLOW + "'start' " + ANSI_RESET + "to play the " +
                "game, " + ANSI_YELLOW + "'controls' " + ANSI_RESET + "to learn how to play, and " + ANSI_YELLOW +
                "'exit' " + ANSI_RESET + "to end the program:");

        while (ans.equals("yes")) {
            System.out.println(" ");
            System.out.print("> ");
            String input = scan.nextLine().toLowerCase();

            switch (input) {
                case "start":
                    System.out.println("\n--------------------\n");
                    System.out.println("The clock strikes 12:00nn and you're feeling hungry. You thought of making " +
                            "garlic bread because one of your\nfriends just bragged about eating some. At this moment, " +
                            "you're situated in your " + ANSI_YELLOW + "living room" + ANSI_RESET +"; you stand up\n" +
                            "from the couch and place your " + ANSI_YELLOW + "phone " + ANSI_RESET + "in your pocket. " +
                            "Let's have a " + ANSI_YELLOW + "'look around'" + ANSI_RESET + ".");
                    livingroom LV = new livingroom();
                    LV.sala();
                    break;
                case "controls":
                    System.out.println("The program gives an output based on phrases, for example: 'look around' and " +
                            "'eat garlic bread'. Basically,\n" + ANSI_YELLOW + "write 'action + object'" + ANSI_RESET +
                            "! The main actions are: " + ANSI_YELLOW + "look, use, check, and go. " + ANSI_RESET +
                            "You can also " + ANSI_YELLOW + "check your phone " + ANSI_RESET + "to\nsee the recipe " +
                            "and know what you need. As of now, there are only two rooms in the game, " + ANSI_YELLOW +
                            "the kitchen and the\nliving room" + ANSI_RESET + ", so you can only go to either of those " +
                            "places. Proceed with caution though, unless you want to\nredo getting ingredients. Also, " +
                            ANSI_YELLOW + "yellow text " + ANSI_RESET + "means important and helps you know what " +
                            "you can interact with!!");
                    System.out.println("Write " + ANSI_YELLOW + "'start' " + ANSI_RESET + "to play the game and " +
                            ANSI_YELLOW + "'exit' " + ANSI_RESET + "to end the program:");
                    break;
                case "exit":
                    System.out.println("Noooo come back ;A;;;");
                    System.exit(0);
                    break;
                default:
                    System.out.println("https://youtu.be/S8UyWmcCQYk (I don't understand. Try again!)");
                    break;
            }
        }
    }
}
