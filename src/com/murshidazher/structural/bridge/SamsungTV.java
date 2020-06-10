/**
 * The <b>SamsungTV</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 06/09/2020
 */

package com.murshidazher.structural.bridge;

public class SamsungTV implements Device {
    @Override
    public void setChannel(int number) {
        System.out.println("Samsung: setChannel");
    }

    @Override
    public void turnOn() {
        System.out.println("Samsung: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: turnOff");
    }
}
