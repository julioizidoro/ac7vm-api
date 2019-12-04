package br.com.ac7vm;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ac7vmApiApplication implements CommandLineRunner {
	
	@PostConstruct
    public void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));//	TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
    }

	public static void main(String[] args) {
		SpringApplication.run(Ac7vmApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}

