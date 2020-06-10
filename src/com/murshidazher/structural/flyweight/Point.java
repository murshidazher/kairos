/**
 * The <b>Point</b> class serves as Point of interest
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 06/09/2020
 */

package com.murshidazher.structural.flyweight;

public class Point {
    private int x; // 4 bytes
    private int y; // 4 bytes
    private PointIcon icon;

    public Point(int x, int y, PointIcon icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }

    public void draw() {
        System.out.printf("%s at (%d, %d)", icon.getType(), x, y);
    }
}
