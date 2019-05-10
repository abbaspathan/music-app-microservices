package com.capgemini.songinfoservice.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.songinfoservice.entity.Song;

@Repository
public interface SongDao extends MongoRepository<Song, Integer> {

	public List<Song> findByAlbumId(int albumId);

	public List<Song> findByArtistName(String artistName);
}
