package com.capgemini.albuminfoservice.service;

import java.util.List;

import com.capgemini.albuminfoservice.entity.Album;

public interface AlbumService {
	public Album addNewAlbum(Album album);
	public List<Album> getAllAlbums();
	public Album getAlbumById(int albumId);
}
