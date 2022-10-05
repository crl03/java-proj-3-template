package com.javaunit3.springmvc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class MovieApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MovieApp.class);

        BestMovieService bestMovieService = applicationContext.getBean("bestMovieService", BestMovieService.class);

        Movie bestMovie = bestMovieService.getBestMovie();

//        System.out.printf("Title: %s\nMaturity Rating: %s\nGenre: %s\n", bestMovie.getTitle(), bestMovie.getMaturityRating(), bestMovie.getGenre());
        System.out.println("Title:\t\t" + bestMovie.getTitle());
        System.out.println("Maturity:\t" + bestMovie.getMaturityRating());
        System.out.println("Genre:\t\t" + bestMovie.getGenre());
    }
}
