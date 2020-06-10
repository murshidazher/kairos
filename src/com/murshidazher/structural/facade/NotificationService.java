/**
 * The <b>NotificationService</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 06/09/2020
 */

package com.murshidazher.structural.facade;

public class NotificationService {
    public void send(String message, String target) {
        // only place to change
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("ip");
        AuthToken authToken = server.authenticate("appID", "key");
        server.send(authToken, new Message(message), target);
        connection.disconnect();
    }
}
