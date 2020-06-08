/**
 * The <b>SelectionTool</b> class serves as an implementation of ConcreteState in State pattern.
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 05/08/2020
 */

package com.murshidazher.behavioral.state;

public class SelectionTool implements Tool {

    @Override
    public void mouseUp() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw dashed rectangle");
    }
}
