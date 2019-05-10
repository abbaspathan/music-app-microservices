package com.capgemini.songinfoservice.entity;

import java.util.List;

public class SongList {

	private List<Song> songs;

	public SongList() {
		super();
	}

	public SongList(List<Song> songs) {
		super();
		this.songs = songs;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

}
