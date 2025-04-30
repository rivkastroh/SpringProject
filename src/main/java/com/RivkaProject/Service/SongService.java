package com.RivkaProject.Service;

import com.RivkaProject.Data.Song;
import com.RivkaProject.Repository.SongRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class SongService {

    private final SongRepository songRepository;

    public List<Song> findAll() {return this.songRepository.findAll();}

    public Song findById(Integer id) {return songRepository.findById(id).get();}
    public Song save(Song song) {return songRepository.save(song);}
    public void delete(Song song) {songRepository.delete(song);}

    public String deleteById(Integer id) {
        if (songRepository.existsById(id)) {
            songRepository.deleteById(id);
            return "Deleted";
        }
        return "not found";
    }

    public String update(Song song) {
        if (song != null && songRepository.existsById(song.getId())) {
            songRepository.save(song);
            return song.getName() + " updated successfully";
        }
        return "Song not found";
    }
}
