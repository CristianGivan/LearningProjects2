package BudgetManager;

import java.util.ArrayList;
import java.util.List;


public class Menu {

    public static void getMenu(int menuNumber) {

        List<String> menuList = getMenuList(menuNumber);

        System.out.println("Select from 0 to " + (menuList.size() - 1) + " from the to options: \n");
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println(typeInPrefix(i) + menuList.get(i));
        }
    }

    public static String getMenuLine(int menuNumber, int menuLine) {
        String line = "";
        List<String> menuList = getMenuList(menuNumber);
        line = menuList.get(menuLine);
        return line;
    }

    public static List<String> getMenuList(int menuNumber) {

        List<String> menuList = new ArrayList<>();
        switch (menuNumber) {
            case 1:
                menuList = mainMenu();
                break;
            case 2:
                menuList = chooseUserMenu();
                break;
            case 3:
                menuList = userMenu();
                break;
            default:
                break;
        }
        return menuList;
    }

    public static String typeInPrefix(int index) {
        return "Type in " + index + " to ";
    }

    public static List<String> mainMenu() {
        List<String> mainMenu = new ArrayList<>();
        mainMenu.add("exit");
        mainMenu.add("Choose user");
        mainMenu.add("Create new user");
        return mainMenu;
    }

    public static List<String> chooseUserMenu() {
        List<String> mainMenu = new ArrayList<>();
        mainMenu.add("exit this menu");
        mainMenu.add("acces general info");
        mainMenu.add("display all open trades");
        mainMenu.add("display all trades");
        mainMenu.add("A4");
        mainMenu.add("A5");
        return mainMenu;
    }
    public static List<String> userMenu() {
        List<String> userMenu = new ArrayList<>();
        userMenu.add("exit report menu");
        userMenu.add("Schimbarea bugetului");
        userMenu.add("Vizualizarea bugetului disponibil");
        userMenu.add("Adaugarea unei cheltuieli");
        userMenu.add("Stergerea unei cheltuieli");
        userMenu.add("Incarcarea in aplicatie a tuturor cheltuielilor dintr-un fisier");
        userMenu.add("Salvarea tuturor cheltuielilor intr-un fisier");
        userMenu.add("Vizualizarea tututor cheltuielilor");
        userMenu.add("Vizualizarea cheltuielilor dintr-o anumita categorie");
        userMenu.add("Vizualizarea cheltuielilor grupate pe categorii");
        userMenu.add("Vizualizarea categoriei in care a cheltuil cel mai mult/mai putin");
        userMenu.add("Vizualizarea tuturor cheltuielilor dintr-un interval de pret");
        userMenu.add("Sortarea tuturor cheltuielilor dupa pret");
        userMenu.add("Sortarea cheltuielilor dintr-o anumita categorie dupa pret");
        return userMenu;
    }
    public static List<String> testMenu() {
        List<String> mainMenu = new ArrayList<>();
        mainMenu.add("exit this menu");
        mainMenu.add("see login response");
        mainMenu.add("T2");
        return mainMenu;
    }
}
