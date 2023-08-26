package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringCounterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCounterAppApplication.class, args);	
	}

}
@RestController
class HelloController {

    private int counter = 0;

    @GetMapping("/hello")
    public String helloWorld() {
        counter++;
        return "Hi-Hello-world-" + counter;
    }
}