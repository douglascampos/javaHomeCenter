package br.com.codenight.homecenter;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.codenight.homecenter.model.Place;
import br.com.codenight.homecenter.model.Sensor;
import br.com.codenight.homecenter.repository.PlaceRepository;
import br.com.codenight.homecenter.repository.SensorRepository;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
public class HomeCenter {
	
	private @Autowired SensorRepository temperatureRepository;
	private @Autowired PlaceRepository placeRepository;
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HomeCenter.class, args);
    }
    
    
    @PostConstruct
	public void init() {
    	
    	Sensor temperature = new Sensor("sala", "temperature", 30.0);
    	temperatureRepository.save(temperature);
    	
    	Place place = new Place("bedroom");
    	placeRepository.save(place);
    	
    }
}
