/**
 * The <b>UIControl</b> class serves as ...
 *
 * @author Murshid Azher (https://github.com/murshidazher) <br>
 * @version 1.0
 * Created on 05/09/2020
 */

package com.murshidazher.behavioral.mediator.withobserver;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    public void removeEventHandler(EventHandler eventHandler) {
        eventHandlers.remove(eventHandler);
    }

    protected void notifyEventHandler() {
        for(EventHandler eventHandler : eventHandlers) {
            eventHandler.handle();
        }
    }


}
