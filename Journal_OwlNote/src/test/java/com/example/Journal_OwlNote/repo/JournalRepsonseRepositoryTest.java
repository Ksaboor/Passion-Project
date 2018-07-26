package com.example.Journal_OwlNote.repo;

import com.example.Journal_OwlNote.Model.JournalResponse;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class JournalRepsonseRepositoryTest {

    @Autowired
    private JournalRepsonseRepository journalRepository;

    @Test
    public void findByName_thenReturn() {
        String text = "alex";

        // given
        JournalResponse journalResponse = new JournalResponse(text);
        journalRepository.save(journalResponse);

        // when
        JournalResponse dbJournalResponse = journalRepository.findById(journalResponse.getId()).get();

        // then
        assertThat(dbJournalResponse.getResponse()).isEqualTo(text);
    }
}