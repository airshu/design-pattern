package com.shjlone.command;

public class CeilingFanOnCommand implements Command {

    CeilingFan ceillingFan;

    public CeilingFanOnCommand(CeilingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }
    @Override
    public void execute() {
        ceillingFan.high();
    }

    @Override
    public void undo() {

    }
}
