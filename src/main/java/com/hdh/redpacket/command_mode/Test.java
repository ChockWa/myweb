package com.hdh.redpacket.command_mode;

public class Test {
    public static void main(String[] args) {
        Menu menu = new Menu();
        MenuItem menuItem1 = new MenuItem(new OpenCommand());
        MenuItem menuItem2 = new MenuItem(new CreateCommand());
        MenuItem menuItem3 = new MenuItem(new EditCommand());
        menu.addMenuItem(menuItem1);
        menu.addMenuItem(menuItem2);
        menu.addMenuItem(menuItem3);
        menu.execute();
    }
}
