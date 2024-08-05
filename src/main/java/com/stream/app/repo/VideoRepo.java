package com.stream.app.repo;

import com.stream.app.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VideoRepo extends JpaRepository<Video, String> {


    Optional<Video> findByTitle(String title);



}
