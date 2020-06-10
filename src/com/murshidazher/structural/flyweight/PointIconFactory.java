/**
 * The <b>PointIconFactory</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 06/09/2020
 */

package com.murshidazher.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    private Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType type) {
        // key -> value
        // PointType -> PointIcon
        if(!icons.containsKey(type)){
            // null -> cafe.jpg (array of bytes)
            PointIcon icon = new PointIcon(type, null);
            icons.put(type, icon);
        }

        return icons.get(type);
    }
}
