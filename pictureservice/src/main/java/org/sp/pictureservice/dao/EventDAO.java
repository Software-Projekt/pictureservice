package org.sp.pictureservice.dao;

import org.sp.pictureservice.model.Event;

public class EventDAO extends GenericDAO<Event> {
	public EventDAO() {
		super(Event.class);
	}
}
