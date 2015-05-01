package br.com.codenight.homecenter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
public class HomeCenter {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HomeCenter.class, args);
    }
}
