/**
 * The <b>Group</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 05/10/2020
 */

package com.murshidazher.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void render() {
        for(Component component: components)
            component.render();

    }

    @Override
    public void move() {
        for(Component component: components)
            component.move();
    }
}
