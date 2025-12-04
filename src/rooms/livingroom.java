package rooms;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class livingroom {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public void sala() throws IOException {
        Scanner scan = new Scanner(System.in);
        List<String> inv = new ArrayList<String>();
        String ans = "ulit";
        inv.add("PHONE");

        while (ans.equals("ulit")) {
            System.out.println(" ");
            System.out.print("> ");
            String input = scan.nextLine().toLowerCase();

            if (input.contains("look")) {
                if (input.contains("around")) {
                    System.out.println("The living room is decorated with simplicity in mind. A " + ANSI_YELLOW +
                            "clock "  + ANSI_RESET + "and a " + ANSI_YELLOW + "TV " + ANSI_RESET + "are mounted on the " +
                            ANSI_YELLOW + "wall " + ANSI_RESET + "in front of you.\nTo your right is the " + ANSI_YELLOW
                            + "kitchen" + ANSI_RESET + ".");
                } else if (input.contains("clock")) {
                    System.out.println("The wall clock shows 12 noon. You believe that it should show that it's " +
                            "garlic bread time.");
                } else if (input.contains("tv") || input.contains("television")) {
                    System.out.println("The TV is turned off. You don't feel like watching anything right now. Maybe " +
                            "watching a garlic bread tutorial\nwould be good but you already have a recipe in your " +
                            ANSI_YELLOW + "phone" + ANSI_RESET + ".");
                } else if (input.contains("wall")) {
                    System.out.println("Family and graduation pictures are hanged on your living room wall, including " +
                            "the clock and TV. You remember\nreplacing one of the pictures with John Cena once.");
                } else if (input.contains("couch") || input.contains("sofa")) {
                    System.out.println("You can see a dent in the cushions from your laying earlier.");
                } else if (input.contains("phone") || input.contains("mobile")) {
                    System.out.println("Your old phone. The phone cover is crumbling apart but your new one hasn't " +
                            "arrived yet. It's currently turned\noff, but " + ANSI_YELLOW +"you can use or check it " +
                            "anytime." + ANSI_RESET);
                } else if (input.contains("garlic bread")) {
                    System.out.println("You gently cradle your invisible garlic bread in your arms, thinking about " +
                            "how delicious it would be when you\nactually" + ANSI_YELLOW + " make it." + ANSI_RESET);
                } else if (input.contains("inv")) {
                    System.out.println(ANSI_YELLOW + "YOUR POCKET:\n " + inv + ANSI_RESET);
                } else {
                    System.out.println("Where is it? Maybe you're thinking of something else.");
                }
            }

            else if (input.contains("go")) {
                if (input.contains("kitchen")) {
                    System.out.println("You walk through your living room and arrive at your kitchen. Let's have a " +
                            ANSI_YELLOW + "'look around'" + ANSI_RESET + ".");
                    kitchen kusina = new kitchen();
                    kusina.kusina();
                } else if (input.contains("living room")) {
                    System.out.println("Omae wa mou koko. (You're already here.)");
                } else {
                    System.out.println("You don't feel like going there right now. You have better things to do.");
                }
            }

            else if (input.contains("use") || input.contains("check")) {
                if ((input.contains("phone") || input.contains("mobile")) || input.contains("check") && input.contains("recipe")) {
                    System.out.println("You pulled out your phone from your pocket and opened it to your friend's recipe. You should "
                            + ANSI_YELLOW + "go to the kitchen\n" + ANSI_RESET + "first to make it.");
                    System.out.println(ANSI_YELLOW + " Megu's recipe for garlic bread:\n  Cut the baguette!\n  Make the " +
                            "butter spreadd\n    Use softened butter para mas madali\n    Then add finely chopped garlic, " +
                            "parsely, cheese, salt, and pepper!!\n    Mix mix mix until combinedd\n  Toast thy baguette\n  " +
                            "Then spread the garlic mixture!\n  Bake at oven\n  Then tadaaa you have your garlic bread!" +
                            ANSI_RESET);
                } else if (input.contains("check") && input.contains("inv")) {
                    System.out.println(ANSI_YELLOW + "YOUR POCKET:\n " + inv + ANSI_RESET);
                } else {
                    System.out.println("You have no such thing. Check your " + ANSI_YELLOW + "inventory " + ANSI_RESET +
                            "to see what you have!");
                }
            }

            else if (input.contains("make") && input.contains("garlic bread")) {
                System.out.println("You should " + ANSI_YELLOW + "go to the kitchen " + ANSI_RESET + "first.");
            }

            else {
                System.out.println("You cannot even fathom what you were going to do, so you stayed put.");
            }
        }
    }
}