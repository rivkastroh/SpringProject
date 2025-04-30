package com.RivkaProject.Repository;

import com.RivkaProject.Data.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Integer> {
}
