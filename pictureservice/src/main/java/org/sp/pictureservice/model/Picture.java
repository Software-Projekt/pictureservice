package org.sp.pictureservice.model;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Access(AccessType.FIELD)
@Table(name="picture")
public class Picture {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="picture_id")
	@SequenceGenerator(name="picture_id", sequenceName="seq_picture_id", allocationSize = 1)
	private long id;
	private long eventId;
	private String title;
	private String url;
	private Date created;
	
	public Picture(){}
	
	public Picture(long id, String title, String url){
		this.id = id;
		this.title = title;
		this.url = url;
		this.created = new Date(System.currentTimeMillis());
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}
	
	
	
}
