package com.amy.magic;// package ?


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class JdbcAnswersDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcAnswersDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public Answer getRandomAnswerByCategory(int category) {
        ArrayList<Answer> answers = new ArrayList<>();
        String sql = "SELECT * FROM magic8Ball WHERE category = ? ORDER BY RANDOM() LIMIT 1"; //for user to choose category by number


            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, category);
            if (results.next()) {
               return mapRowToAnser(results);
            }
            return null;

        //pick a random answer
        if (answers.isEmpty()){
            return null;
        }

        Random random = new Random();
        return answer.get(random.nextInt(answers.size()));
    }
    private Answer mapRowToAnser(SqlRowSet rs) {
        Answer answer = new Answer();
        answer.setAnswer(rs.getString("answers"));
        answer.setCategory(rs.getInt("category"));
        return answer;
    }
}


