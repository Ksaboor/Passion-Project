package com.example.Journal_OwlNote.Model;

import javax.persistence.*;

@Entity
public class JournalResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String response;

    public JournalResponse(){}

    public JournalResponse(String response) {
        this.response = response;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

}
