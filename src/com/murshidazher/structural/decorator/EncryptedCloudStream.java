/**
 * The <b>EncryptedCloudStream</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 05/19/2020
 */

package com.murshidazher.structural.decorator;

public class EncryptedCloudStream extends CloudStream {

    @Override
    public void write(String data) {
        String encrypted = encrypt(data);
        super.write(encrypted);
    }

    private String encrypt(String data) {
        return "(*@!##!@*)(&%$@";
    }
}
