package com.explore.moviedataservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rating {
    private String movieId;
    private int rating;
}
