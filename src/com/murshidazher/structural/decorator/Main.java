/**
 * The <b>Main</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 05/19/2020
 */

package com.murshidazher.structural.decorator;

public class Main {
    public static void main(String[] args) {
        // write your code here
        CloudStream cloudStream = new EncryptedCloudStream();
        cloudStream.write("Here's some data");

    }
}
