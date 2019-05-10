package com.capgemini.albuminfoservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.albuminfoservice.entity.Album;

@Repository
public interface AlbumDao extends MongoRepository<Album, Integer> {

}
