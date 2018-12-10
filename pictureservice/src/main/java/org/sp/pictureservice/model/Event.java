package org.sp.pictureservice.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
@Access(AccessType.FIELD)
@Table(name="event")
public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="event_id")
	@SequenceGenerator(name="event_id", sequenceName="seq_event_id", allocationSize = 1)
	private long id;
	private String name;
	private String grusswort;
	private boolean fuerGastFreigegeben;
	private Date archivierungsDatum;
	private Date erstellungsDatum;
	private Map<Long, Picture> pictures = new HashMap<>();
	
	public Event(){}

	public Event(String name, String grusswort, boolean fuerGastFreigegeben, Date archivierungsDatum,
			Date erstellungsDatum) {
		this.name = name;
		this.grusswort = grusswort;
		this.fuerGastFreigegeben = fuerGastFreigegeben;
		this.archivierungsDatum = archivierungsDatum;
		this.erstellungsDatum = erstellungsDatum;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrusswort() {
		return grusswort;
	}

	public void setGrusswort(String grusswort) {
		this.grusswort = grusswort;
	}

	public boolean isFuerGastFreigegeben() {
		return fuerGastFreigegeben;
	}

	public void setFuerGastFreigegeben(boolean fuerGastFreigegeben) {
		this.fuerGastFreigegeben = fuerGastFreigegeben;
	}

	public Date getArchivierungsDatum() {
		return archivierungsDatum;
	}

	public void setArchivierungsDatum(Date archivierungsDatum) {
		this.archivierungsDatum = archivierungsDatum;
	}

	public Date getErstellungsDatum() {
		return erstellungsDatum;
	}

	public void setErstellungsDatum(Date erstellungsDatum) {
		this.erstellungsDatum = erstellungsDatum;
	}

	@XmlTransient
	public Map<Long, Picture> getPictures() {
		return pictures;
	}

	public void setPictures(Map<Long, Picture> pictures) {
		this.pictures = pictures;
	}
	
	//Kommentar
}
