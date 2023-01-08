package com.example.movieDirectorProject.Controller;

import com.example.movieDirectorProject.Model.Movie;
import com.example.movieDirectorProject.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;
    @PostMapping("/movie")
    public void createMovie(@RequestBody() Movie movie){
        movieService.createMovie(movie);
    }
    @GetMapping("/movie/{name}")
    public String getDirectorNameByMovieName(@PathVariable("name") String name){
       return movieService.getDirector(name);
    }
}
