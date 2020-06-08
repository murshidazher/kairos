/**
 * The <b>EraserTool</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 05/08/2020
 */

package com.murshidazher.behavioral.state;

public class EraserTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Eraser icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Eraser something");
    }
}
