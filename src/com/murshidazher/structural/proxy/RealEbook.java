/**
 * The <b>Ebook</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 06/09/2020
 */

package com.murshidazher.structural.proxy;

public class RealEbook implements Ebook {
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Loaidng the ebook" + fileName);
    }

    @Override
    public void show() {
        System.out.println("Showing the ebook" + fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
