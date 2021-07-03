package com.shjlone.command;

public class CeilingFanHighCommand implements Command {

    CeilingFan ceillingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceillingFan.getSpeed();
        ceillingFan.high();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.HIGH) {
            ceillingFan.high();
        } else if(prevSpeed == CeilingFan.MEDIUM) {
            ceillingFan.medium();
        } else if(prevSpeed == CeilingFan.LOW) {
            ceillingFan.low();
        } else {
            ceillingFan.off();
        }
    }
}
