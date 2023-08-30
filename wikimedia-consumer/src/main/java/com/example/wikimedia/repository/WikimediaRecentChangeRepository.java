package com.example.wikimedia.repository;

import com.example.wikimedia.entity.WikimediaRecentChange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WikimediaRecentChangeRepository extends JpaRepository<WikimediaRecentChange, Long> {

}
