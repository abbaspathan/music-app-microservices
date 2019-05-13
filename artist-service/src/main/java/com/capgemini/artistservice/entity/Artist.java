package com.capgemini.artistservice.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "artistDetails")
public class Artist {
	
	@Id
	private int artistId;
	private String artistName;
	private String artistImage;
	private List<Song> songs;
	
	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Artist(int artistId, String artistName, String artistImage, List<Song> songs) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
		this.artistImage = artistImage;
		this.songs = songs;
	}

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getArtistImage() {
		return artistImage;
	}

	public void setArtistImage(String artistImage) {
		this.artistImage = artistImage;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	
	
}
