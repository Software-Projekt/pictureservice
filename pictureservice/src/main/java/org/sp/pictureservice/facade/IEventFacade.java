package org.sp.pictureservice.facade;

import org.sp.pictureservice.model.Event;

public interface IEventFacade {

	void saveEvent(Event aEvent);

	Event updateEvent(Event aEvent);

	Event find(int eventID);

}