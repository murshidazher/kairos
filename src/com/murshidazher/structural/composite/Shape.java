/**
 * The <b>Shape</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 05/10/2020
 */

package com.murshidazher.structural.composite;

public class Shape implements Component {
    @Override
    public void render() {
        System.out.println("Render shape");
    }

    @Override
    public void move() {
        System.out.println("Move shape");
    }
}
