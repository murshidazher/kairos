/**
 * The <b>Main</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 06/09/2020
 */

package com.murshidazher.structural.proxy;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        String[] fileNames = { "a", "b", "c" };

        for (String fileName: fileNames)
            library.add(new EbookProxy(fileName));

        library.openEbook("a");
    }
}
