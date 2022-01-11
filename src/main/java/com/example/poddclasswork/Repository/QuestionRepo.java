package com.example.poddclasswork.Repository;

import com.example.poddclasswork.Payload.QuestionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionRepo extends JdbcDaoSupport {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public QuestionRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(QuestionRequest questionRequest) {
        String sql = "INSERT INTO questions " +
                "(title, description) VALUES (?, ?)" ;

        int result = jdbcTemplate.update(sql, new Object[]{
                questionRequest.getTitle(), questionRequest.getDescription()
        });

        return result;
    }
}
