package br.com.codenight.homecenter;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.codenight.homecenter.model.Temperature;
import br.com.codenight.homecenter.repository.TemperatureRepository;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
public class HomeCenter {
	
	private @Autowired TemperatureRepository temperatureRepository;
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HomeCenter.class, args);
    }
    
    
    @PostConstruct
	public void init() {
    	Temperature temperature = new Temperature("sala", 30.0);
    	
    	temperatureRepository.save(temperature);
    	
    }
}
