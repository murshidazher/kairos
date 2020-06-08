/**
 * The <b>Main</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 05/09/2020
 */

package com.murshidazher.behavioral.command;

import com.murshidazher.behavioral.command.fx.Button;
import com.murshidazher.behavioral.command.fx.Command;

public class Main {
    public static void main(String[] args) {
        // Basic implementation of the Command Pattern
        CustomerService service = new CustomerService();
        Command command = new AddCustomerCommand(service);
        Button button = new Button(command);

        button.click();

        // Composite Command Pattern
        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.add(new ResizeCommand());
        compositeCommand.add(new ResizeCommand());
        compositeCommand.execute(); // we can replay it multiple times if required

    }
}
