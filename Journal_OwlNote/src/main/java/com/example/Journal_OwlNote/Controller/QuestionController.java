package com.example.Journal_OwlNote.Controller;


import com.example.Journal_OwlNote.Model.Question;
import com.example.Journal_OwlNote.repo.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("questions")
@CrossOrigin(origins = {"http://localhost:8100"})
public class QuestionController {

    @Autowired
    private QuestionRepository questionrepo;

    @GetMapping("/Getquestions")
    public List<Question> questions(){
        return questionrepo.findAll();
    }

    @GetMapping("/questions/{id}")
    public Question getById(@PathVariable long id){
        return questionrepo.findById(id).get();
    }

    @PostMapping("/questions")
    public Question postQuestion(@RequestBody Question questionResponse){ return questionrepo.save(questionResponse);}
}

