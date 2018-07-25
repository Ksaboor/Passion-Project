package com.example.Journal_OwlNote.Controller;
import com.example.Journal_OwlNote.Model.JournalResponse;
import com.example.Journal_OwlNote.repo.JournalRepsonseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/vi")
@CrossOrigin(origins = {"http://localhost:8100"})
public class JournalResponseController {

    @Autowired
    private JournalRepsonseRepo journalRepo;

    @GetMapping("/response")
    public List<JournalResponse> journalresponse(){ return journalRepo.findAll();}

    @GetMapping("/responses/{id}")
    public List<JournalResponse> getbyId(@PathVariable long id){ return journalRepo.findAll();}

    @PostMapping("/responses")
    public JournalResponse post(@RequestBody JournalResponse response) {
        return journalRepo.save(response);
    }

    public List<JournalResponse> postJournalResponse(){ return journalRepo.findAll();}
}
