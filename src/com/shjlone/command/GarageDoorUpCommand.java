package com.shjlone.command;

public class GarageDoorUpCommand implements Command {

    GarageDoor garagedoor;

    public GarageDoorUpCommand(GarageDoor garagedoor) {
        this.garagedoor = garagedoor;
    }
    @Override
    public void execute() {
        garagedoor.up();
    }

    @Override
    public void undo() {

    }
}
