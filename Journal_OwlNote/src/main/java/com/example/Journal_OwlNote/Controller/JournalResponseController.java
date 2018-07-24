package com.example.Journal_OwlNote.Controller;

import com.example.Journal_OwlNote.Model.JournalResponse;
import com.example.Journal_OwlNote.Model.Question;
import com.example.Journal_OwlNote.repo.JournalRepsonseRepo;
import com.example.Journal_OwlNote.repo.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
@CrossOrigin(origins = {"http://localhost:8100"})
public class JournalResponseController {

    @Autowired
    private JournalRepsonseRepo repsonseRepo;

    @GetMapping("/questions")
    public List<JournalResponse> questions(){
        return repsonseRepo.findAll();
    }

    @GetMapping("/questions/{id}")
    public JournalResponse getById(@PathVariable long id){
        return repsonseRepo.findById(id).get();
    }

}
