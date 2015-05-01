package br.com.codenight.homecenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.codenight.homecenter.model.Temperature;
import br.com.codenight.homecenter.repository.TemperatureRepository;

//@Controller
@RestController
public class TemperatureController {

	private @Autowired TemperatureRepository temperatureRepository;
	
    @RequestMapping("/temperature")
    @ResponseBody
    public Iterable<Temperature> temp() {
    	return temperatureRepository.findAll();
    }
}
