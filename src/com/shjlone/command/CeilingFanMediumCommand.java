package com.shjlone.command;

public class CeilingFanMediumCommand implements Command {

    CeilingFan ceillingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceillingFan.getSpeed();
        ceillingFan.medium();
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
