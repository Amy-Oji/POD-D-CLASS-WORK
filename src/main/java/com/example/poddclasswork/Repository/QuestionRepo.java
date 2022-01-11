package com.example.poddclasswork.Repository;

import com.example.poddclasswork.Payload.QuestionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Repository
public class QuestionRepo extends JdbcDaoSupport {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize(){
        setDataSource(dataSource);
    }

    public int save(QuestionRequest questionRequest) {
        String sql = "INSERT INTO questions " +
                "(title, description) VALUES (?, ?)" ;
        int result = getJdbcTemplate().update(sql, new Object[]{
                questionRequest.getTitle(), questionRequest.getDescription()
        });
        return result;
    }
}
