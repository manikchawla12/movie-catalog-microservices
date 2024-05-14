package com.explore.movieinfoservice.controller;

import com.explore.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/info")
public class InfoController {

    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable ("movieId") String movieId){
        return new Movie(movieId,"Inception");
    }
}
