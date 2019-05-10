package com.capgemini.songinfoservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.songinfoservice.dao.SongDao;
import com.capgemini.songinfoservice.entity.Song;
import com.capgemini.songinfoservice.service.SongService;

@Service
public class SongServiceImpl implements SongService {

	@Autowired
	private SongDao dao;

	@Override
	public Song addNewSong(Song song) {
		return dao.insert(song);
	}

	@Override
	public List<Song> getAllSongs() {
		return dao.findAll();
	}

	@Override
	public List<Song> getAllSongsByAlbmId(int albumId) {
		return dao.findByAlbumId(albumId);
	}

	@Override
	public List<Song> getAllSongsByArtistName(String artistName) {
		return dao.findByArtistName(artistName);
	}

}
