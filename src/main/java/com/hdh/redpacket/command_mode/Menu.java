package com.hdh.redpacket.command_mode;

import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public void addMenuItem(MenuItem menuItem){
        this.menuItems.add(menuItem);
    }

    public void execute(){
        for(MenuItem menuItem : menuItems){
            menuItem.onClick();
        }
    }
}
