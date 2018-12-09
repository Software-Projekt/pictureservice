package org.sp.pictureservice.mb;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.sp.pictureservice.facade.IEventFacade;
import org.sp.pictureservice.facade.impl.EventFacadeImpl;
import org.sp.pictureservice.model.Event;

@ManagedBean(name="eventMB")
@RequestScoped
public class EventMB {
	
	private static final String STAY_ON_SAME_PAGE = null;
	private static final String ZEIGE_ALLE_EVENTS = null;
	
	@EJB
	private IEventFacade eventFacade = new EventFacadeImpl();
	
	private Event event;
	
	public void setEvent(Event event) {//TODO: nur zum testen
		this.event = event;
	}

	public String createEventEnd() {
		try {
			eventFacade.saveEvent(event);
			event = new Event();
		} catch(EJBException e) {
			sendErrorMessageToUser("Fehler beim Speichern von der Veranstaltung!");
			return STAY_ON_SAME_PAGE;
		}
		return ZEIGE_ALLE_EVENTS;
	}
	
	private void sendErrorMessageToUser(String message){
		FacesContext context = getContext();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, message, message));
	}
	
	private FacesContext getContext() {
		FacesContext context = FacesContext.getCurrentInstance();
		return context;
	}
}
