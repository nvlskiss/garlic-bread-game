package rooms;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class sala {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public void libing() throws IOException {
        Scanner scan = new Scanner(System.in);
        List<String> inv = new ArrayList<String>();
        List<String> inv2 = new ArrayList<String>();
        String ans = "ulit";
        String mo = "ikai";
        inv.add("PLATE OF GARLIC BREAD");
        inv2.add("PHONE");
        System.out.println("The house smells of garlic and bread, just the way you like it. With your plate in hand, " +
                "you sit on the couch\nand turn on your TV. You can't wait to " + ANSI_YELLOW + "eat your garlic bread"
                + ANSI_RESET + ".");

        while (ans.equals("ulit")) {
            System.out.println(" ");
            System.out.print("> ");
            String input = scan.nextLine().toLowerCase();

            if (input.contains("look")) {
                if (input.contains("around")) {
                    System.out.println("The living room is decorated with simplicity in mind. A " + ANSI_YELLOW +
                            "clock "  + ANSI_RESET + "and a " + ANSI_YELLOW + "TV " + ANSI_RESET + "are mounted on the " +
                            ANSI_YELLOW + "wall " + ANSI_RESET + "in front of you.\nTo your right is the kitchen.");
                } else if (input.contains("clock")) {
                    System.out.println("The wall clock shows 12:30pm. You believe that it should show that it's eat garlic " +
                            "bread time.");
                } else if (input.contains("tv") || input.contains("television")) {
                    System.out.println("The TV is playing a series that you randomly chose. The story description and " +
                            "art style looked promising; it\neven features an attractive aswang leader. Tabi tabi po.");
                } else if (input.contains("wall")) {
                    System.out.println("Family and graduation pictures are hanged on your living room wall, including " +
                            "the clock and TV. You wish that\nyou could hang a picture of garlic bread there.");
                } else if (input.contains("couch") || input.contains("sofa")) {
                    System.out.println("A soft, comfortable couch. It's the perfect size for you to lay on.");
                } else if (input.contains("garlic bread")) {
                    System.out.println("Perfectly toasted and glistening with butter and garlic. You'd marry it if " +
                            "you could, but it's time to " + ANSI_YELLOW + "eat " + ANSI_RESET + "it.");
                } else if (input.contains("phone") || input.contains("mobile")) {
                    System.out.println("Your old phone. The phone cover is crumbling apart but your new one hasn't " +
                            "arrived yet. It's currently turned\noff, but " + ANSI_YELLOW +"you can use or check it " +
                            "anytime." + ANSI_RESET);
                } else {
                    System.out.println("Where is it? Maybe you're thinking of something else.");
                }
            }

            else if (input.contains("use") || input.contains("check")) {
                if ((input.contains("phone") || input.contains("mobile")) || input.contains("check") && input.contains("recipe")) {
                    System.out.println("You pulled out your phone from your pocket and opened it to read your friend's " +
                            "recipe. You should really thank him later.");
                    System.out.println(ANSI_YELLOW + " Megu's recipe for garlic bread:\n  Cut the baguette!\n  Make the " +
                            "butter spreadd\n   Use softened butter para mas madali\n   Then add finely chopped garlic, " +
                            "parsely, cheese, salt, and pepper!!\n   Mix mix mix until combinedd\n  Toast thy baguette\n  " +
                            "Then spread the garlic mixture!\n  Bake at oven\n  Then tadaaa you have your garlic bread!" +
                            ANSI_RESET);
                } else if (input.contains("inv")) {
                    System.out.println(ANSI_YELLOW + "YOUR HAND:\n " + inv + ANSI_RESET);
                    System.out.println(ANSI_YELLOW + "YOUR POCKET:\n " + inv2 + ANSI_RESET);
                } else {
                    System.out.println("You have no such thing. Check your " + ANSI_YELLOW + "inventory " + ANSI_RESET +
                            "to see what you have!");
                }
            }

            else if (input.contains("go")) {
                System.out.println("You don't feel like going anywhere right now. The couch feels too comfortable " +
                        "to leave and you still haven't\n" + ANSI_YELLOW + "eaten your garlic bread" + ANSI_RESET + "!");
            }

            else if (input.contains("eat")){
                if (input.contains("garlic bread")){
                    System.out.println("You eat the garlic bread slowly and savor its delicious flavor. You " +
                            "tried your best to follow the recipe\neven if there's some information missing. Maybe " +
                            "checking a recipe from a website would have been better.\nNevertheless, you'll have to " +
                            "thank your friend later for the help.\n" + ANSI_RED + " -1 PLATE OF GARLIC BREAD" +
                            ANSI_RESET);
                    System.out.println(ANSI_CYAN + " +1 HAPPINESS" + ANSI_RESET);
                    System.out.println("\nVerdict?");
                    System.out.print("> ");
                    String inpot = scan.nextLine().toLowerCase();
                    break;
                }
                else {
                    System.out.println("You're supposed to eat " + ANSI_YELLOW + "garlic bread" + ANSI_RESET +
                            ", not that.");
                }
            }

            else {
                System.out.println("You cannot even fathom what you were going to do, so you stayed put.");
            }
        }

        System.out.println("\n--------------------\n");
        System.out.println("Thank you for playing! I hope you enjoyed making garlic bread!");
        System.out.println("Write " + ANSI_YELLOW + "'start' " + ANSI_RESET + "to restart the " + "game, " + ANSI_YELLOW +
                "'controls' " + ANSI_RESET + "to learn how to play, and " + ANSI_YELLOW + "'exit' " + ANSI_RESET + "to " +
                "end the program:");

        while (mo.equals("ikai")) {
            System.out.println(" ");
            System.out.print("> ");
            String again = scan.nextLine().toLowerCase();

            switch (again) {
                case "start":
                    dialogue dia = new dialogue();
                    livingroom LV = new livingroom();
                    dia.start();
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
                    System.out.println("Bye-bye! ^^/");
                    System.exit(0);
                    break;
                default:
                    System.out.println("https://youtu.be/S8UyWmcCQYk (I don't understand. Try again!)");
                    break;
            }
        }
    }
}

class dialogue{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public void start(){
        System.out.println("\n\nThe clock strikes 12:00nn and you're feeling hungry. You thought of making " +
                "garlic bread because one of your\nfriends just bragged about eating some. At this moment, " +
                "you're situated in your " + ANSI_YELLOW + "living room" + ANSI_RESET +"; You stand up\n" +
                "from the couch and place your " + ANSI_YELLOW + "phone " + ANSI_RESET +"in your pocket. Let's have a " +
                ANSI_YELLOW + "'look around'" + ANSI_RESET + ".");
    }
}