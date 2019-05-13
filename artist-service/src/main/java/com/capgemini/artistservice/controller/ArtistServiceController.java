package com.capgemini.artistservice.controller;

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
import org.springframework.web.client.RestTemplate;

import com.capgemini.artistservice.entity.Artist;
import com.capgemini.artistservice.entity.SongList;
import com.capgemini.artistservice.service.ArtistService;

@RestController
@CrossOrigin("*")
public class ArtistServiceController {

	@Autowired
	private ArtistService artistService;
	
	private String baseUrl = "http://localhost:8082/song";
	
	@PostMapping("/artist")
	public ResponseEntity<Artist> addNewArtist(@RequestBody Artist artist){
		artist = artistService.addNewArtist(artist);
		return new ResponseEntity<Artist>(artist,HttpStatus.CREATED);	
	}
	
	@GetMapping("/artist")
	public ResponseEntity<List<Artist>> getAll() {
		List<Artist> artists = artistService.getAll();
		return new ResponseEntity<List<Artist>>(artists,HttpStatus.OK);
	}
	
	@GetMapping("/artist/{artistId}")
	public ResponseEntity<Artist> getById(@PathVariable int artistId) {
		Artist artist = artistService.getById(artistId);
		RestTemplate restTemplate = new RestTemplate();
		SongList songList = restTemplate.getForEntity(baseUrl + "/artist/" + artistId , SongList.class).getBody();
		artist.setSongs(songList.getSongs());
		return new ResponseEntity<Artist>(artist,HttpStatus.OK);	
	}
}
