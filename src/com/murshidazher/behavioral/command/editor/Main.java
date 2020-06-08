/**
 * The <b>Main</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 05/09/2020
 */

package com.murshidazher.behavioral.command.editor;


public class Main {
    public static void main(String[] args) {
        // write your code here
        History history = new History();
        HtmlDocument document = new HtmlDocument();
        document.setContent("Hello World");

        UndoableCommand boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute(); // ctrl + z
        System.out.println(document.getContent());

    }
}
