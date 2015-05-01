package br.com.codenight.homecenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.codenight.homecenter.model.Sensor;
import br.com.codenight.homecenter.repository.SensorRepository;

//@Controller
@RestController
public class SensorController {

	private @Autowired SensorRepository sensorRepository;
	
    @RequestMapping("/sensor")
    @ResponseBody
    public Iterable<Sensor> temp() {
    	return sensorRepository.findAll();
    }
}
