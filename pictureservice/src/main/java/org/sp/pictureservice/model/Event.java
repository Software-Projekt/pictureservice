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
	private String title;
	private Date date;
	private Map<Long, Picture> pictures = new HashMap<>();
	
	public Event(){}
	
	public Event (String title, Date date){
		this.id = id;
		this.title = title;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
