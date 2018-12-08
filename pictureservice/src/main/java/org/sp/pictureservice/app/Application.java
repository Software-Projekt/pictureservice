package org.sp.pictureservice.app;

import java.util.Date;

import javax.ejb.EJB;

import org.sp.pictureservice.facade.IEventFacade;
import org.sp.pictureservice.model.Event;

public class Application {

	public static void main(String[] args) {
		@EJB
		IEventFacade eventFacade;
		Event event = new Event("j", new Date());
		eventFacade.saveEvent(event);
		
	}

}
