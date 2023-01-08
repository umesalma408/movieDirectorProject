package com.example.movieDirectorProject.Repository;

import com.example.movieDirectorProject.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    Movie findByName(String name);
}
