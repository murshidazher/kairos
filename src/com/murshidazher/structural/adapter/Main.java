/**
 * The <b>Main</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 05/18/2020
 */

package com.murshidazher.structural.adapter;

import com.murshidazher.structural.adapter.avaFilters.Caramel;
import com.murshidazher.structural.adapter.avaFilters.CaramelFilter;

public class Main {
    public static void main(String[] args) {
        // write your code here
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));

    }
}
