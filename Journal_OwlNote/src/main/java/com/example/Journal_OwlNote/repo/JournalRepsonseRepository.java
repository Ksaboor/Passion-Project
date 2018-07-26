package com.example.Journal_OwlNote.repo;

import com.example.Journal_OwlNote.Model.JournalResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepsonseRepository extends JpaRepository<JournalResponse, Long> {
}
