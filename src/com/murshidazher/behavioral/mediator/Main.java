/**
 * The <b>Main</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 05/09/2020
 */

package com.murshidazher.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        // write your code here
        DialogBox dialogBox = new ArticlesDialogBox();
        ((ArticlesDialogBox) dialogBox).simulateUserInteraction();

    }
}
