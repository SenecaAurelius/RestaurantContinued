package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdated = new Date();
    private ArrayList<MenuItem> menuList = new ArrayList<>();

    public Menu(ArrayList<MenuItem> menuList){
        this.menuList = menuList;
    }

    public ArrayList<MenuItem> getMenuList() {
        return menuList;
    }

    public void checkLastUpdated(){
        System.out.println(this.lastUpdated);
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void checkAndRemoveItem(MenuItem item){
        if(this.menuList.contains(item)){
            System.out.println("We found the " + item.getDescription() + ".");
            menuList.remove(menuList.indexOf(item));
            this.setLastUpdated(new Date());
        } else if (!this.menuList.contains(item)) {
            System.out.println("No such menu item found");
        }
    }

    public void checkAndAddItem(MenuItem item) {
        if (this.menuList.contains(item)){
            System.out.println("The " + item.getDescription() + " item is already on the menu! ");
        } else {
            this.menuList.add(item);
            this.setLastUpdated(new Date());
        }
    }

    public void printAll(){
        for(MenuItem item : menuList){
            System.out.println(item.getDescription());
        }
    }

    public void printOne(MenuItem item){
        if(menuList.contains(item)){
            System.out.println("The " + item.getDescription() + " is on the menu.");
        } else if (!menuList.contains(item)){
            System.out.println("The " + item.getDescription() + " is not on the menu.");
        }
    }
}
