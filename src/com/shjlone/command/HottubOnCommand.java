package com.shjlone.command;

public class HottubOnCommand implements Command {

    Hottub hottub;

    public HottubOnCommand(Hottub tv) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOn();
    }

    @Override
    public void undo() {
        hottub.jetsOff();
    }
}
