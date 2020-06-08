/**
 * The <b>CaramelAdapter</b> class serves as implementation of Adapter using inheritance.
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 05/19/2020
 */

package com.murshidazher.structural.adapter.avaFilters;

import com.murshidazher.structural.adapter.Filter;
import com.murshidazher.structural.adapter.Image;

public class CaramelAdapter extends Caramel implements Filter {

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
