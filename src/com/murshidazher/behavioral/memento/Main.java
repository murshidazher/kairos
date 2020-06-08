/**
 * The <b>Main</b> class serves as ...
 *
 * @author Mohamed Murshid Mohamed Azher (emailid@example.com) <br>
 * @version 1.0
 * Created on 05/08/2020
 */

package com.murshidazher.behavioral.memento;

public class Main {

    public static void main(String[] args) {

        // Example implentation

        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        editor.setFontName("Sans Serif");
        editor.setFontSize(24);
        history.push(editor.createState());

        editor.setContent("b");
        editor.setFontName("Times New Roman");
        editor.setFontSize(16);
        history.push(editor.createState());

        editor.setContent("c");
        editor.setFontSize(18);
        editor.restore(history.pop());

        System.out.println(editor.getContent());
        System.out.println(editor.getFontName());
        System.out.println(editor.getFontSize());

    }
}