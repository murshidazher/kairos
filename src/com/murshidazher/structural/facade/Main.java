/**
 * The <b>Main</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 06/09/2020
 */

package com.murshidazher.structural.facade;

public class Main {

    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.send("Hello World", "target");
    }
}