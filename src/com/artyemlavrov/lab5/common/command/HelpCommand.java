package com.artyemlavrov.lab5.common.command;

import com.artyemlavrov.lab5.common.interpreter.Interpreter;
import com.artyemlavrov.lab5.common.interpreter.InterpreterLoop;
import com.artyemlavrov.lab5.common.io.IOManager;

public class HelpCommand extends Command {

    @Override
    public void execute(InterpreterLoop interpreterLoop, IOManager ioManager) {
        Interpreter interpreter = interpreterLoop.getInterpreter();
        CommandFactory commandFactory = interpreter.getCommandFactory();
        for (Command command : commandFactory.getAllCommands()) {
            ioManager.write(command.getName() + " ");
            ioManager.writeLine(command.getDescription());
        }
    }

    @Override
    public String getDescription() {
        return "вывести справку по доступным командам";
    }

    @Override
    public String getName() {
        return "help";
    }
}