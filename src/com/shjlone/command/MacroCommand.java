package com.shjlone.command;

/**
 * 批量执行命令
 */
public class MacroCommand implements Command {

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }

    Command[] commands;
    @Override
    public void execute() {
        for (int i=0; i<commands.length;i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i=0; i<commands.length;i++) {
            commands[i].undo();
        }
    }
}
