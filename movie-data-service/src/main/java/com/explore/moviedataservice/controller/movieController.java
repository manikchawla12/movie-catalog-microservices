package com.explore.moviedataservice.controller;

import com.explore.moviedataservice.model.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rateData")
public class movieController {

    @GetMapping("/{movieId}")
    public Rating getRatingData(@PathVariable("movieId") String movieId){
        return new Rating(movieId,4);
    }
}
