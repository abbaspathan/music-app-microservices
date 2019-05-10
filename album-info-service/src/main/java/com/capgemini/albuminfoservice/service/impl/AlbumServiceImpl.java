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
		return albumDao.findById(albumId).get();
	}

}
