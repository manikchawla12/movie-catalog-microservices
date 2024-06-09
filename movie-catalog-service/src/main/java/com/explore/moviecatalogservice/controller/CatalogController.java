package com.explore.moviecatalogservice.controller;

import com.explore.moviecatalogservice.model.CatalogItem;
import com.explore.moviecatalogservice.model.Movie;
import com.explore.moviecatalogservice.model.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class CatalogController {




    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        RestTemplate restTemplate= new RestTemplate();


        List<Rating> ratings= Arrays.asList(
                new Rating("123",4),
                new Rating("456",3)
        );

       return ratings.stream().map(rating ->{
              Movie movie= restTemplate.getForObject("http://localhost:8081/info/"+rating.getMovieId(), Movie.class);
              return new CatalogItem(movie.getMovieName(), "A Christopher nolan movie",rating.getRating());
       })
                .collect(Collectors.toList());
    }
}
