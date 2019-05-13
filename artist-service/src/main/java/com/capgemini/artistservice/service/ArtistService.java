package com.capgemini.artistservice.service;

import java.util.List;

import com.capgemini.artistservice.entity.Artist;


public interface ArtistService {
	
	public Artist addNewArtist(Artist artist);

	public List<Artist> getAll(); 
	
	public Artist getById(int id);

}
