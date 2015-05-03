package main.java.br.com.codenight.homecenter.controller;

import main.java.br.com.codenight.homecenter.model.Place;
import main.java.br.com.codenight.homecenter.repository.PlaceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class PlaceController {
	
	private @Autowired PlaceRepository placeRepository;
	
	@RequestMapping("/place")
    @ResponseBody
	public Iterable<Place> listAll(){
		return placeRepository.findAll();
	}
}
