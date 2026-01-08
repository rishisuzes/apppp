package com.example.appppp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ApppppApplication {

    @GetMapping("/message")
    public String getapp(){
        return "welcome to web services";
    }

	public static void main(String[] args) {
		SpringApplication.run(ApppppApplication.class, args);
	}

}
