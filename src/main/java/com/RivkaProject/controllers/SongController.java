package com.RivkaProject.controllers;

import com.RivkaProject.Data.Person;
import com.RivkaProject.Data.Song;
import com.RivkaProject.Service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class SongController {
    private final SongService songService;

    @GetMapping("/songs/")
    public List<Song> findAll() { return songService.findAll(); }

    @GetMapping("/songs/{id}")
    public Song findById(@PathVariable int id) { return  songService.findById(id); }

    @PostMapping("/songs/")
    public String save(@RequestBody Song song) { return songService.save(song).toString(); }

    @PutMapping("/songs/")
    public String update(@RequestBody Song song) { return songService.update(song); }

    @DeleteMapping("/songs/{id}")
    public String Delete(@PathVariable int id) { return songService.deleteById(id); }

}
