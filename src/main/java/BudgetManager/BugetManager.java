package BudgetManager;

import java.util.Scanner;

public class BugetManager {
    public static void main(String[] args) {
       /* //theMainMenu();
        int menuNumber = 1;
        int previousMenu = 1;
        int currentMenu = 1;
        int fromMenu;
        int choice ;
        Menu.getMenu(currentMenu);
        do {

            choice = numberTypedByUser();//= displayAndChooseFromMenu(menuNumber);
            doFromMenu(previousMenu, currentMenu, choice);


        } while (choice != 0);*/
        theMainMenu();
    }

/*

    public static int doFromMenu(int previousMenu, int currentMenu, int choice) {
        switch (currentMenu) {
            case 0:
                return previousMenu;
            case 1:
                Menu.getMenu(1);
                menu1(currentMenu,choice);
                return currentMenu;
            case 2:
                Menu.getMenu(2);
                menu2(currentMenu,choice);
                return currentMenu;
            default:
                System.out.println("ERROR!!!");
                return 0;
        }
    }


    public static void menu1(int currentMenu,int choice) {
        //Menu.getMenu(1);
        switch (choice) {
            case 0:
                //

                break;
            case 1:
                //do
                System.out.println("m1A1");
                break;
            case 2:
                //do
                break;
            default:
                System.out.println("ERROR!!!");
                break;
        }
    }

    public static void menu2(int currentMenu,int choice) {
        Menu.getMenu(2);
        switch (choice) {
            case 1:
                //do
                System.out.println("m1A1");
                break;
            case 2:
                //do
                break;
            default:
                System.out.println("ERROR!!!");
                break;
        }
    }
*/

    public static int theMainMenu() {
        int menuNumber = 1;
        int fromMenu;
        int menuSize = Menu.getMenuList(menuNumber).size();
        int choice = menuSize;
        do {
            if (choice >= menuSize) {
                choice = displayAndChooseFromMenu(menuNumber);
            }
            fromMenu = menuNumber;
            switch (choice) {
                case 0:
                    System.out.println("You chose to exit, goodbye!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("You chose to " + Menu.getMenuList(menuNumber).get(choice));
                    break;
                case 2:
                    System.out.println("You chose to " + Menu.getMenuList(menuNumber).get(choice));
                    break;
                case 3:
                    System.out.println("You chose to " + Menu.getMenuList(menuNumber).get(choice));
                    break;
                case 4:
                    System.out.println("You chose to " + Menu.getMenuList(menuNumber).get(choice));
                    break;
                case 5:
                    System.out.println("You chose to " + Menu.getMenuList(menuNumber).get(choice));
                    break;
                case 6:
                    System.out.println("You chose to " + Menu.getMenuList(menuNumber).get(choice));
                    break;
                case 7:
                    System.out.println("You chose to " + Menu.getMenuList(menuNumber).get(choice));
                    break;
                case 8:
                    System.out.println("You chose to " + Menu.getMenuList(menuNumber).get(choice));
                    break;
                case 9:
                    System.out.println("You chose to " + Menu.getMenuList(menuNumber).get(choice));
                    break;
                case 10:
                    System.out.println("You chose to " + Menu.getMenuList(menuNumber).get(choice));
                    break;
                case 11:
                    System.out.println("You chose to " + Menu.getMenuList(menuNumber).get(choice));
                    break;
                case 12:
                    System.out.println("You chose to " + Menu.getMenuList(menuNumber).get(choice));
                    break;
                case 13:
                    System.out.println("You chose to " + Menu.getMenuList(menuNumber).get(choice));
                    break;

                default:
                    System.out.println("ERROR!!!");
                    break;
            }
            choice = choseToRedoAction(choice, fromMenu, menuNumber, menuSize);
        } while (choice != 0);
        return menuNumber;
    }

    public static int displayAndChooseFromMenu(int menuNumber) {

        Menu.getMenu(menuNumber);
        System.out.println("\nYour chose is:");
        return numberTypedByUser();
    }

    public static int choseToRedoAction(int choice, int fromMenu, int menuNumber, int menuSize) {
        if (fromMenu == menuNumber) {
            System.out.println("\nType 0 to exit from current manu" + "\nType " + choice + " to redo the action" + "\nType from 1 to " + (menuSize - 1) + " to execut an action from this menu" + "\nType any other number grater then " + (menuSize - 1) + " to return to the manu!\n");
            return numberTypedByUser();
        } else {
            return displayAndChooseFromMenu(menuNumber);

        }
    }

    public static String textTypedByUser() {
        //todo treat exceptions
        Scanner console = new Scanner(System.in);
        return console.nextLine();
    }

    public static int numberTypedByUser() {
        Scanner console = new Scanner(System.in);
        int numberTyped = -1;
        int numberOfTries = 3;
        do {
            try {
                numberTyped = Integer.parseInt(console.nextLine());
                numberOfTries = 0;
            } catch (NumberFormatException e) {
                numberOfTries--;
                if (numberOfTries == 0) {
                    System.out.println("You tried to many times, good bye");
                } else if (numberOfTries == 1) {
                    System.out.println("You didn't typed a number, you have " + numberOfTries + " more time to type the desired number");
                } else {
                    System.out.println("You didn't typed a number, you have " + numberOfTries + " more times to type the desired number");
                }
            }
        } while (numberOfTries != 0);
        //console.close();
        return numberTyped;
    }
}
