package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student john = new Student(
                    "john@mail.com",
                    "John Doe",
                    LocalDate.of(1986, Month.APRIL, 12));

            Student marry = new Student(
                    "marry@mail.com",
                    "Marry Christmas",
                    LocalDate.of(1998, Month.JULY, 28));

            Student allen = new Student(
                    "allendoe@mail.com",
                    "Allen Doe",
                    LocalDate.of(1988, Month.MARCH, 10));

            Student furkan = new Student(
                    "fkozmac@gmail.com",
                    "Furkan Kozmaç",
                    LocalDate.of(2002, Month.MARCH, 23));

            repository.saveAll(
                    List.of(john, allen, marry, furkan));
        };
    }
}
