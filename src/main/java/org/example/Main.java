package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuList = new ArrayList<>();
        Menu menu = new Menu(menuList);

        MenuItem peanuts = new MenuItem(1.99, "Peanuts", "appetizer", false);
        MenuItem lambShank = new MenuItem(20.99, "Lamb flesh, served warm", "main course", false);
        MenuItem badCostcoQuiche = new MenuItem(12.99, "Really bad quiche", "main course", true);
        MenuItem cake = new MenuItem(6.00, "cake", "dessert", false);

//        menu.getMenuList().add(peanuts);
//        menu.getMenuList().add(lambShank);
//        menu.getMenuList().add(cake);
        menu.checkAndAddItem(peanuts);
        menu.checkAndAddItem(lambShank);
        menu.checkAndAddItem(cake);
        menu.checkAndAddItem(cake);

//        menu.printOne(peanuts);
//        menu.printOne(badCostcoQuiche);
//        menu.checkAndRemoveItem(badCostcoQuiche);

        menu.printAll();

        menu.checkAndRemoveItem(cake);
        menu.printAll();
        menu.checkLastUpdated();
    }
}