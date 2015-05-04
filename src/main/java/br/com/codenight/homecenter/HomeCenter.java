package main.java.br.com.codenight.homecenter;
import javax.annotation.PostConstruct;

import main.java.br.com.codenight.homecenter.model.Place;
import main.java.br.com.codenight.homecenter.model.Scanner;
import main.java.br.com.codenight.homecenter.model.Sensor;
import main.java.br.com.codenight.homecenter.repository.PlaceRepository;
import main.java.br.com.codenight.homecenter.repository.ScannerRepository;
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
	private @Autowired ScannerRepository scannerRepository;
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HomeCenter.class, args);
    }
    
    
    @PostConstruct
	public void init() {
    	
    	Sensor temperature = new Sensor("temperature");
    	Sensor humidity = new Sensor("humidity");
    	Place place = new Place("bedroom");
    	Scanner scanner = new Scanner(67.0, "02/05/2015 19:30");
    	Scanner scanner2 = new Scanner(76.0, "02/05/2014 19:30");
    	
    	Scanner scanner3 = new Scanner(99.0, "01/07/2014 19:30");
    	
    	place.addSensor(temperature);
    	
    	place.addSensor(humidity);
    	
    	temperature.addScanner(scanner);
    	temperature.addScanner(scanner2);
    	
    	humidity.addScanner(scanner3);
    	
    	placeRepository.save(place);
    	sensorRepository.save(temperature);
    	scannerRepository.save(scanner);
    }
}
