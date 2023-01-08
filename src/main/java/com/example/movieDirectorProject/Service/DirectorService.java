package com.example.movieDirectorProject.Service;

import com.example.movieDirectorProject.Model.Director;
import com.example.movieDirectorProject.Model.Movie;
import com.example.movieDirectorProject.Repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DirectorService {
    @Autowired
    DirectorRepository directorRepository;

    public void createDirector(Director director) {
        directorRepository.save(director);
    }

    public Director getDirector(int id) {
        return directorRepository.findById(id).get();
    }
}
