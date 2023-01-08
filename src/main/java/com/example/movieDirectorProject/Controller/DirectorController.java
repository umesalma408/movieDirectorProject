package com.example.movieDirectorProject.Controller;

import com.example.movieDirectorProject.Model.Director;
import com.example.movieDirectorProject.Model.Movie;
import com.example.movieDirectorProject.Service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DirectorController {
    @Autowired
    DirectorService directorService;
    @PostMapping("/director")
    public void createDirector(@RequestBody() Director director){
        directorService.createDirector(director);
    }
    @GetMapping("/director/{id}")
    public Director getDirector(@PathVariable("id") int id){
        return directorService.getDirector(id);
    }
}
