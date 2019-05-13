package com.capgemini.artistservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.artistservice.entity.Artist;

@Repository
public interface ArtistServiceDAO extends MongoRepository<Artist, Integer>{
	
}
