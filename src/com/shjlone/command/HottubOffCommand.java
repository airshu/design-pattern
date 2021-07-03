package com.shjlone.command;

public class HottubOffCommand implements Command {

    Hottub hottub;

    public HottubOffCommand(Hottub tv) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOff();
    }

    @Override
    public void undo() {
        hottub.jetsOn();
    }
}
