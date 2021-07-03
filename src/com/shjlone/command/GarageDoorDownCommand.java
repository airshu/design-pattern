package com.shjlone.command;

public class GarageDoorDownCommand implements Command {

    GarageDoor garagedoor;

    public GarageDoorDownCommand(GarageDoor garagedoor) {
        this.garagedoor = garagedoor;
    }
    @Override
    public void execute() {
        garagedoor.down();
    }

    @Override
    public void undo() {

    }
}
