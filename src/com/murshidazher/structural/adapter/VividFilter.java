/**
 * The <b>VividFilter</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 05/18/2020
 */

package com.murshidazher.structural.adapter;

public class VividFilter implements Filter {
    @Override
    public void apply(Image image) {
        System.out.println("Applying Vivid Filter");
    }
}
