/**
 * The <b>EbookProxy</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 06/09/2020
 */

package com.murshidazher.structural.proxy;

public class EbookProxy implements Ebook {
    private String fileName;
    private RealEbook ebook; // initialize only when we open it

    public EbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        // lazy initialization
        if (ebook == null)
            ebook = new RealEbook(fileName);

        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
