package com.shjlone.command;

public class CeilingFanLowCommand implements Command {

    CeilingFan ceillingFan;
    int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceillingFan.getSpeed();
        ceillingFan.low();
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
