package com.hdh.redpacket.command_mode;

public abstract class Command {
    protected BoardScreen boardScreen = new BoardScreen();

    abstract void execute();
}
