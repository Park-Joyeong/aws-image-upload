package com.jobs.awsimageupload;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
          Student maria = new Student(
                  "Maria",
                  "Jones",
                  "maria.jones@jobs.com",
                  21
          );
          studentRepository.save(maria);
        };
    }
}
