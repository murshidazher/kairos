/**
 * The <b>CaramelFilter</b> class serves as implementation of Adapter using composition.
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 05/19/2020
 */

package com.murshidazher.structural.adapter.avaFilters;

import com.murshidazher.structural.adapter.Filter;
import com.murshidazher.structural.adapter.Image;

public class CaramelFilter implements Filter {
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }


    @Override
    public void apply(Image image) {
        caramel.init(); // ex. requirements set the third party library
        caramel.render(image);
    }
}
