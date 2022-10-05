package com.javaunit3.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BestMovieService {

//    @Autowired
    private Movie movie;

    @Autowired
    public BestMovieService(@Qualifier("titanicMovie") Movie movie){
        this.setBestMovieService(movie);
    }

    public void setBestMovieService(Movie movie) {
        this.movie = movie;
    }

    public Movie getBestMovie() {
        return movie;
    }
}
