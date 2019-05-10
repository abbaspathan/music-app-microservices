package com.capgemini.albuminfoservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capgemini.albuminfoservice.dao.AlbumDao;
import com.capgemini.albuminfoservice.entity.Album;
import com.capgemini.albuminfoservice.entity.SongList;
import com.capgemini.albuminfoservice.service.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService {

	@Autowired
	private AlbumDao albumDao;

	private String baseUrl = "http://localhost:8082/song";

	@Override
	public Album addNewAlbum(Album album) {
		return albumDao.insert(album);
	}

	@Override
	public List<Album> getAllAlbums() {
		return albumDao.findAll();
	}

	@Override
	public Album getAlbumById(int albumId) {
		RestTemplate restTemplate = new RestTemplate();
		SongList songList = restTemplate.getForEntity(baseUrl + "/album/" + albumId, SongList.class).getBody();
		Album album = albumDao.findById(albumId).get();
		album.setSongs(songList.getSongs());
		return album;
	}

}
