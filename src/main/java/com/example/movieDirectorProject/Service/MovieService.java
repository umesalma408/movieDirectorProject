package com.example.movieDirectorProject.Service;

import com.example.movieDirectorProject.Model.Director;
import com.example.movieDirectorProject.Model.Movie;
import com.example.movieDirectorProject.Repository.DirectorRepository;
import com.example.movieDirectorProject.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public void createMovie(Movie movie) {
        movieRepository.save(movie);
    }

    public String getDirector(String name) {
       Movie movie= movieRepository.findByName(name);
       Director director = movie.getDirector();
       return director.getName();
    }
}
