package com.example.galleryservice.model;

import java.util.ArrayList;
import java.util.List;

public class Gallery {

	
	int id;
	List<Object> images = new ArrayList<Object>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Object> getImages() {
		return images;
	}
	public void setImages(List<Object> images) {
		this.images = images;
	}
}
