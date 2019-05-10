package com.capgemini.albuminfoservice.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "albumDetails")
public class Album {

	@Id
	private int albumId;
	private String albumName;
	private String albumImage;
	private List<Song> songs;

	public Album() {
		super();
	}

	public Album(int albumId, String albumName, String albumImage, List<Song> songs) {
		super();
		this.albumId = albumId;
		this.albumName = albumName;
		this.albumImage = albumImage;
		this.songs = songs;
	}

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getAlbumImage() {
		return albumImage;
	}

	public void setAlbumImage(String albumImage) {
		this.albumImage = albumImage;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

}
