package com.capgemini.albuminfoservice.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.albuminfoservice.entity.Album;
import com.capgemini.albuminfoservice.service.AlbumService;

@RestController
@CrossOrigin("*")
public class AlbumController {

	@Autowired
	private AlbumService albumService;

	@PostMapping("/album")
	public ResponseEntity<Album> addNewAlbum(@RequestBody Album album) {
		Album album2 = albumService.addNewAlbum(album);
		return new ResponseEntity<Album>(album2, HttpStatus.CREATED);
	}

	@GetMapping("/album")
	public ResponseEntity<List<Album>> getAllAlbums() {
		List<Album> albums = albumService.getAllAlbums();
		return new ResponseEntity<List<Album>>(albums, HttpStatus.OK);
	}

	@GetMapping("/album/{albumId}")
	public ResponseEntity<Album> getAlbumById(@PathVariable int albumId) {
		Album album = albumService.getAlbumById(albumId);
		return new ResponseEntity<Album>(album, HttpStatus.OK);
	}
}
