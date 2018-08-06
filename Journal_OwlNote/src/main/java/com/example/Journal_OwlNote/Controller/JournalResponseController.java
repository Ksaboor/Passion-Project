package com.example.Journal_OwlNote.Controller;
import com.example.Journal_OwlNote.Model.JournalResponse;
import com.example.Journal_OwlNote.repo.JournalRepsonseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("journalResponse")
@CrossOrigin(origins = {"http://localhost:8100"})
public class JournalResponseController {


    private JournalRepsonseRepository journalRepo;

    @Autowired
    public JournalResponseController(JournalRepsonseRepository journalRepo){
        this.journalRepo = journalRepo;
    }

    @GetMapping("/response")
    public List<JournalResponse> journalresponse(){ return journalRepo.findAll();}

    @GetMapping("/responses/{id}")
    public List<JournalResponse> getbyId(@PathVariable long id){ return journalRepo.findAll();}

    @PostMapping("/responses")
    public JournalResponse post(@RequestBody JournalResponse response) { return journalRepo.save(response); }

   // public List<JournalResponse> postJournalResponse(){ return journalRepo.findAll();}

    @DeleteMapping("/delete")
    public @ResponseBody ResponseEntity<String> delete() {
        return new ResponseEntity<String>("DELETE Response", HttpStatus.OK);
    }
}
