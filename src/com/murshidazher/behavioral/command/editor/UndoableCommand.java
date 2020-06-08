package com.murshidazher.behavioral.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
