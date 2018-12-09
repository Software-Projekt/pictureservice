package org.sp.pictureservice.facade.impl;

import javax.ejb.EJB;

import org.sp.pictureservice.dao.EventDAO;
import org.sp.pictureservice.facade.IEventFacade;
import org.sp.pictureservice.model.Event;

public class EventFacadeImpl implements IEventFacade {
	@EJB
	private EventDAO eventDAO = new EventDAO();
	
	/* (non-Javadoc)
	 * @see org.sp.pictureservice.facade.impl.IEventFacade#saveEvent(org.sp.pictureservice.model.Event)
	 */
	@Override
	public void saveEvent(Event aEvent) {
		eventDAO.save(aEvent);
	}
	
	/* (non-Javadoc)
	 * @see org.sp.pictureservice.facade.impl.IEventFacade#updateEvent(org.sp.pictureservice.model.Event)
	 */
	@Override
	public Event updateEvent(Event aEvent) {
		return eventDAO.update(aEvent);
	}
	
	/* (non-Javadoc)
	 * @see org.sp.pictureservice.facade.impl.IEventFacade#find(int)
	 */
	@Override
	public Event find(int eventID) {
		return eventDAO.find(eventID);
	}
}
