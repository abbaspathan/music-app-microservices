package com.capgemini.artistservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.artistservice.dao.ArtistServiceDAO;
import com.capgemini.artistservice.entity.Artist;

@Service
public class ArtistServiceImpl implements ArtistService{

	@Autowired
	ArtistServiceDAO artistServiceDao;
	
	@Override
	public Artist addNewArtist(Artist artist) {
		return artistServiceDao.save(artist);
	}

	@Override
	public List<Artist> getAll() {
		return artistServiceDao.findAll();
	}

	@Override
	public Artist getById(int id) {
		return artistServiceDao.findById(id).get();
	}

}
