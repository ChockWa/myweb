package com.hdh.redpacket.command_mode;

public class MenuItem {
    private String name;
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public Command getCommand(){
        return this.command;
    }

    public MenuItem(Command command){
        this.command = command;
    }

    public void onClick(){
        command.execute();
    }
}
