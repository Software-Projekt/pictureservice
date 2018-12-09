package org.sp.pictureservice.app;

import java.util.Date;

import javax.ejb.EJB;

import org.sp.pictureservice.dao.EventDAO;
import org.sp.pictureservice.facade.IEventFacade;
import org.sp.pictureservice.mb.EventMB;
import org.sp.pictureservice.model.Event;

public class Application {
	public static void main(String[] args) {
		
		EventMB eventMB = new EventMB();
		eventMB.setEvent(new Event(0, "dd", "grusswort", true, new Date(), new Date()));
		eventMB.createEventEnd();
	}

}
