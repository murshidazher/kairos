/**
 * The <b>Main</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 05/08/2020
 */

package com.murshidazher.behavioral.iterator;

public class Main {

    public static void main(String[] args) {

        // Example implentation
       BrowseHistory browseHistory = new BrowseHistory();
       browseHistory.push("a");
       browseHistory.push("b");
       browseHistory.push("c");

       Iterator<String> iterator = browseHistory.createIterator();

       while (iterator.hasNext()) {
           String url = iterator.current();
           System.out.println(url);
           iterator.next();
       }

    }
}
