package com.example.Journal_OwlNote.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;

@Entity
@Table
public class JournalResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Response")
    private ArrayList Responses;

    @Column(name = "QUESTION")
    private ArrayList Questions;

//    private HashMap<Long,HashMap<String,String>> jamming;

    public Long getId() {
        return id;
    }

    public JournalResponse(ArrayList Questions) {
        this.Questions = Questions;
        Questions.add("This is dummy Question????");
        Questions.add("This is dummy Question????");
        Questions.add("This is dummy Question????");
        Questions.add("This is dummy Question????");
        Questions.add("This is dummy Question????");
        Questions.add("This is dummy Question????");
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList getResponses() {
        return Responses;
    }

    public void setResponses(ArrayList responses) {
        Responses = responses;
    }

    public ArrayList getQuestions() {
        return Questions;
    }

    public void setQuestions(ArrayList questions) {
        Questions = questions;
    }
}
