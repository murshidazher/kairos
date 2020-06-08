/**
 * The <b>Main</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 05/10/2020
 */

package com.murshidazher.structural.composite;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Group group1 = new Group();
        group1.add(new Shape()); // square
        group1.add(new Shape()); // square

        Group group2 = new Group();
        group2.add(new Shape()); // circle
        group2.add(new Shape()); // circle

        Group group = new Group();
        group.add(group1);
        group.add(group2);
        group.render();


    }
}
