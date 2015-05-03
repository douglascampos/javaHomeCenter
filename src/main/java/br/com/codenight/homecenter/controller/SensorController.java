package main.java.br.com.codenight.homecenter.controller;

import main.java.br.com.codenight.homecenter.model.Sensor;
import main.java.br.com.codenight.homecenter.repository.SensorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
