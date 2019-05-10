package com.capgemini.songinfoservice.controller;

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

import com.capgemini.songinfoservice.entity.Song;
import com.capgemini.songinfoservice.entity.SongList;
import com.capgemini.songinfoservice.service.SongService;

@RestController
@CrossOrigin("*")
public class SongController {

	@Autowired
	private SongService songService;

	@PostMapping("/song")
	public ResponseEntity<Song> addNewSong(@RequestBody Song song) {
		Song song2 = songService.addNewSong(song);
		return new ResponseEntity<Song>(song2, HttpStatus.OK);
	}

	@GetMapping("/song")
	public ResponseEntity<List<Song>> getAllSongs() {
		List<Song> songs = songService.getAllSongs();
		return new ResponseEntity<List<Song>>(songs, HttpStatus.OK);
	}

	@GetMapping("/song/album/{albumId}")
	public ResponseEntity<SongList> getAllSongsByAlbumId(@PathVariable int albumId) {
		SongList songs = new SongList();
		songs.setSongs(songService.getAllSongsByAlbmId(albumId));
		return new ResponseEntity<SongList>(songs, HttpStatus.OK);
	}

	@GetMapping("/song/artist/{artistName}")
	public ResponseEntity<SongList> getAllSongsByArtistName(@PathVariable String artistName) {

		SongList songs = new SongList();
		songs.setSongs(songService.getAllSongsByArtistName(artistName));
		return new ResponseEntity<SongList>(songs, HttpStatus.OK);
	}
}
