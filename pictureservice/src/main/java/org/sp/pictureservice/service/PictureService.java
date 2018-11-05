package org.sp.pictureservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.sp.pictureservice.database.DatabaseClass;
import org.sp.pictureservice.model.Event;
import org.sp.pictureservice.model.Picture;

public class PictureService {
	
	public static Map<Long, Event> events = DatabaseClass.getEvents();
	
	public PictureService(){
		addPicture(1L, new Picture(1, "Bild1", "https://i.ytimg.com/vi/jL083wMBMlM/maxresdefault.jpg"));
		addPicture(1L, new Picture(2, "Bild2", "https://i.ytimg.com/vi/jL083wMBMlM/maxresdefault.jpg"));
		addPicture(1L, new Picture(3, "Bild3", "https://i.ytimg.com/vi/jL083wMBMlM/maxresdefault.jpg"));
		addPicture(1L, new Picture(4, "Bild4", "https://i.ytimg.com/vi/jL083wMBMlM/maxresdefault.jpg"));
		addPicture(1L, new Picture(5, "Bild5", "https://i.ytimg.com/vi/jL083wMBMlM/maxresdefault.jpg"));
		addPicture(1L, new Picture(6, "Bild6", "https://i.ytimg.com/vi/jL083wMBMlM/maxresdefault.jpg"));
		addPicture(1L, new Picture(7, "Bild7", "https://i.ytimg.com/vi/jL083wMBMlM/maxresdefault.jpg"));
		addPicture(1L, new Picture(8, "Bild8", "https://i.ytimg.com/vi/jL083wMBMlM/maxresdefault.jpg"));

	}

	public List<Picture> getAllPictures(long eventId){
		Map<Long, Picture> pictures = events.get(eventId).getPictures();
		return new ArrayList<Picture>(pictures.values()); 
	}

	
	public Picture getPicture(long eventId, long id){
		Map<Long, Picture> pictures = events.get(eventId).getPictures();
		return pictures.get(id);
	}
	
	public Picture addPicture(long eventId, Picture picture){
		Map<Long, Picture> pictures = events.get(eventId).getPictures();
		picture.setId(pictures.size() + 1);
		picture.setEventId(eventId);
		pictures.put(picture.getId(), picture);
		return picture;
	}
	
	public Picture updatePicture(long eventId, Picture picture){
		Map<Long, Picture> pictures = events.get(eventId).getPictures();
		if (picture.getId() <= 0) {
			return null;
		}
		pictures.put(picture.getId(), picture);
		return picture;
	}

	public Picture removePicture(long eventId, long id){
		Map<Long, Picture> pictures = events.get(eventId).getPictures();
		return pictures.remove(id);
	}
}
