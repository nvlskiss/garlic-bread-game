package rooms;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class kitchen {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public void kusina() throws IOException {
        Scanner scan = new Scanner(System.in);
        List<String> inv = new ArrayList<String>();
        List<String> inv2 = new ArrayList<String>();
        String ans = "ulit";
        inv2.add("PHONE");

        while (ans.equals("ulit")) {
            if (inv.contains("SPOON") && inv.contains("BOWL") && inv.contains("PLATE") && inv.contains("KNIFE") &&
                    inv.contains("BUTTER") && inv.contains("CHEESE") && inv.contains("PARSLEY") &&
                    inv.contains("SALT AND PEPPER") && inv.contains("BREAD") && inv.contains("GARLIC")) {
                System.out.println("\nYou now have every ingredient. It's time to " + ANSI_YELLOW + "make garlic bread!"
                        + ANSI_RESET);
            }

            System.out.println(" ");
            System.out.print("> ");
            String input = scan.nextLine().toLowerCase();

            if (input.contains("look")) {
                if (input.contains("around") || input.contains("kitchen")) {
                    System.out.println("Your kitchen houses normal kitchen appliances. For instance, " + ANSI_YELLOW +
                            "an oven, a utensil drawer, a refrigerator, and a\nmagical door to your pantry!" + ANSI_RESET);
                } else if (input.contains("oven")) {
                    System.out.println("A normal, slightly worn, oven. You make sure to clean it regularly.");
                } else if (input.contains("drawer")) {
                    System.out.println("Schrodinger's drawer. It contains what you need and doesn't at the same time. " +
                            ANSI_YELLOW + "But it usually has your bowls and\nknives." + ANSI_RESET);
                } else if (input.contains("fridge") || input.contains("refrigerator")) {
                    System.out.println("The place where you go to whenever you're bored. It's decorated with magnets " +
                            "your family bought on their vacations. " + ANSI_YELLOW + "\nIt might have some of your " +
                            "ingredients" + ANSI_RESET + ".");
                } else if (input.contains("pantry")) {
                    System.out.println("The door to the pantry is closed. Snacks and " + ANSI_YELLOW + "ingredients " +
                            ANSI_RESET + "are shielded from your eyes.");
                } else if (input.contains("phone") || input.contains("mobile")) {
                    System.out.println("Your old phone. The phone cover is crumbling apart but your new one hasn't " +
                            "arrived yet. It's currently turned\noff, but " + ANSI_YELLOW + "you can use or check it " +
                            "anytime." + ANSI_RESET);
                } else if (input.contains("garlic bread")) {
                    if (!inv.contains("PLATE OF GARLIC BREAD")) {
                        System.out.println("You gently cradle your invisible garlic bread in your arms, thinking about " +
                                "how delicious it would be when you\nactually" + ANSI_YELLOW + " make it." + ANSI_RESET);
                    } else if (inv.contains("PLATE OF GARLIC BREAD")) {
                        System.out.println("Perfectly toasted and glistening with butter and garlic. You'd marry it if " +
                                "you could.");
                    }
                }
                else if (input.contains("inv")) {
                    System.out.println(ANSI_YELLOW + "YOUR KITCHEN TABLE:\n " + inv + ANSI_RESET);
                    System.out.println(ANSI_YELLOW + "YOUR POCKET:\n " + inv2 + ANSI_RESET);
                } else {
                    System.out.println("Where is it? Maybe you're thinking of something else.");
                }
            }

            else if (input.contains("use") || input.contains("check")) {
                if ((input.contains("phone") || input.contains("mobile")) || input.contains("check") && input.contains("recipe")) {
                    System.out.println("You pulled out your phone from your pocket and opened it to read your friend's recipe.");
                    System.out.println(ANSI_YELLOW + " Megu's recipe for garlic bread:\n  Cut the baguette!\n  Make the " +
                            "butter spreadd\n    Use softened butter para mas madali\n    Then add finely chopped garlic, " +
                            "parsely, cheese, salt, and pepper!!\n    Mix mix mix until combinedd\n  Toast thy baguette\n  " +
                            "Then spread the garlic mixture!\n  Bake at oven\n  Then tadaaa you have your garlic bread!" +
                            ANSI_RESET);
                } else if (input.contains("oven")) {
                    System.out.println("Your trusty oven! It's been to hell and back because of your baking mishaps. " +
                            "But you can't use it at the\nmoment because you don't have anything to bake.");
                } else if (input.contains("drawer")) {
                    if (inv.contains("SPOON") && inv.contains("BOWL") && inv.contains("PLATE") && inv.contains("KNIFE")) {
                        System.out.println("There's nothing else to take from the drawer.");
                    } else if (!inv.contains("SPOON") && !inv.contains("BOWL") && !inv.contains("PLATE") && !inv.contains("KNIFE")) {
                        System.out.println("You take a spoon, a bowl, a knife, and a plate from the drawer then set " +
                                "it on the table.");
                        System.out.println(ANSI_CYAN + " +1 SPOON\n +1 BOWL\n +1 PLATE\n +1 KNIFE" + ANSI_RESET);
                        inv.add("SPOON");
                        inv.add("BOWL");
                        inv.add("PLATE");
                        inv.add("KNIFE");
                    }
                } else if (input.contains("fridge") || input.contains("refrigerator")) {
                    if (inv.contains("BUTTER") && inv.contains("CHEESE")) {
                        System.out.println("There's nothing else to take from the fridge.");
                    } else if (!inv.contains("BUTTER") && !inv.contains("CHEESE")) {
                        System.out.println("You take the butter and cheese from the fridge then set it on the table.");
                        System.out.println(ANSI_CYAN + " +1 BUTTER\n +1 CHEESE" + ANSI_RESET);
                        inv.add("BUTTER");
                        inv.add("CHEESE");
                    }
                } else if (input.contains("pantry")) {
                    System.out.print("You open the door to the pantry, a variety of snacks and ingredients flood " +
                            "your eyes. ");
                    if (inv.contains("BREAD") && inv.contains("PARSLEY") && inv.contains("GARLIC") && inv.contains("SALT AND PEPPER")) {
                        System.out.println("You've already taken\neverything from it. What more do you want...");
                    } else if (!inv.contains("BREAD") && !inv.contains("PARSLEY") && !inv.contains("GARLIC") &&
                            !inv.contains("SALT AND PEPPER")) {
                        System.out.println("You see the ingredients\nfor your spread and some bread. Unfortunately, you " +
                                "don't have a baguette. You hope your friend will forgive\nyou.");
                        System.out.println(ANSI_CYAN + " +1 BREAD\n +1 PARSLEY\n +1 GARLIC\n +1 SALT AND PEPPER" + ANSI_RESET);
                        inv.add("PARSLEY");
                        inv.add("SALT AND PEPPER");
                        inv.add("BREAD");
                        inv.add("GARLIC");
                    }
                } else if (input.contains("check") && (input.contains("inv") || input.contains("table"))) {
                    System.out.println(ANSI_YELLOW + "YOUR KITCHEN TABLE:\n " + inv + ANSI_RESET);
                    System.out.println(ANSI_YELLOW + "YOUR POCKET:\n " + inv2 + ANSI_RESET);
                } else {
                    System.out.println("You have no such thing. Check your " + ANSI_YELLOW + "inventory " + ANSI_RESET +
                            "to see what you have!");
                }

            }

            else if (input.contains("go")) {
                if (input.contains("living room")) {
                    System.out.println("You clean up everything then go back to the living room.");
                    if (!inv.contains("PLATE OF GARLIC BREAD")) {
                        livingroom LV = new livingroom();
                        LV.sala();
                    } else if (inv.contains("PLATE OF GARLIC BREAD")) {
                        sala libing = new sala();
                        libing.libing();
                    }
                } else if (input.contains("kitchen")) {
                    System.out.println("Omae wa mou koko. (You're already here.)");
                } else {
                    System.out.println("You don't feel like going there right now. You have better things to do.");
                }
            }

            else if (input.contains("get") && input.contains("ingredients")) {
                System.out.println("You may want to be more specific than that. Try to find them by " + ANSI_YELLOW +
                        "checking the kitchen appliances" + ANSI_RESET + "!");
            }

            else if (input.contains("make") && input.contains("garlic bread")) {
                if (inv.contains("SPOON") && inv.contains("BOWL") && inv.contains("PLATE") && inv.contains("KNIFE") &&
                        inv.contains("BUTTER") && inv.contains("CHEESE") && inv.contains("PARSLEY") &&
                        inv.contains("SALT AND PEPPER") && inv.contains("BREAD") && inv.contains("GARLIC")) {
                    System.out.println("With determination and finesse, you make your spread, toast your bread, bake it, " +
                            "and plate your garlic bread!\nNow, to enjoy it on the comfort of your couch in the " +
                            ANSI_YELLOW + "living room" + ANSI_RESET + ".");
                    System.out.println(ANSI_RED + " -1 BREAD\n -1 BUTTER\n -1 CHEESE\n -1 GARLIC\n -1 PARSLEY\n -1 " +
                            "SALT AND PEPPER\n -1 BOWL\n -1 SPOON\n -1 PLATE" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + " +1 PLATE OF GARLIC BREAD" + ANSI_RESET);
                    inv.remove("SPOON");
                    inv.remove("BOWL");
                    inv.remove("PLATE");
                    inv.remove("KNIFE");
                    inv.remove("BUTTER");
                    inv.remove("CHEESE");
                    inv.remove("PARSLEY");
                    inv.remove("SALT AND PEPPER");
                    inv.remove("BREAD");
                    inv.remove("GARLIC");
                    inv.add("PLATE OF GARLIC BREAD");
                } else {
                    System.out.println("With determination and finesse, you make your invisible garlic bread and eat " +
                            "its entirety in one bite...\nJust kidding, " + ANSI_YELLOW + "get those ingredients first!"
                            + ANSI_RESET);
                }
            }

            else {
                System.out.println("You cannot even fathom what you were going to do, so you stayed put. Maybe you " +
                        "wrote something wrong?");
            }
        }
    }
}