package com.example.Journal_OwlNote;

import com.example.Journal_OwlNote.Model.Question;
import com.example.Journal_OwlNote.repo.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class QuestionSeeder implements ApplicationRunner {
    @Autowired
    public QuestionRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        repository.save(new Question("Where were you five years ago?"));
        repository.save(new Question("Write a letter to your older self."));
        repository.save(new Question("Write a letter to your future children and grandchildren that you can give to them when they are older?"));
        repository.save(new Question("Write a letter to your boss or coworkers."));
        repository.save(new Question("Write about your daily activities so you can look back and remember each moment."));
    }
}
