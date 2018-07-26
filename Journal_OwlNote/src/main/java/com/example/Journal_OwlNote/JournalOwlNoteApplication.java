package com.example.Journal_OwlNote;

import com.example.Journal_OwlNote.Model.Question;
import com.example.Journal_OwlNote.repo.QuestionRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class JournalOwlNoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(JournalOwlNoteApplication.class, args);
	}


}
