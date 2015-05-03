package main.java.br.com.codenight.homecenter;
import javax.annotation.PostConstruct;

import main.java.br.com.codenight.homecenter.model.Place;
import main.java.br.com.codenight.homecenter.model.Sensor;
import main.java.br.com.codenight.homecenter.repository.PlaceRepository;
import main.java.br.com.codenight.homecenter.repository.SensorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
public class HomeCenter {
	
	private @Autowired SensorRepository sensorRepository;
	private @Autowired PlaceRepository placeRepository;
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HomeCenter.class, args);
    }
    
    
    @PostConstruct
	public void init() {
    	
    	Sensor temperature = new Sensor("sala", "temperature", 30.0);
    	Place place = new Place("bedroom");
    	
    	place.addSensor(temperature);
    	
    	placeRepository.save(place);
    	sensorRepository.save(temperature);
    }
}
