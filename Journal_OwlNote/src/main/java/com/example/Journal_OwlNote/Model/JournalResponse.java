package com.example.Journal_OwlNote.Model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class JournalResponse {
    private ArrayList Questions = new ArrayList();
    private ArrayList Responses = new ArrayList();


}
