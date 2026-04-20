package com.amy.magic;// package ?


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class JdbcAnswersDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcAnswersDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public Answer getRandomAnswerByCategory(int category) {

        ArrayList<Answer> answers = new ArrayList<>();
        String sql = "SELECT * FROM magic8Ball WHERE category = ?";


        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, category);

            while (results.next()) {
                Answer answer = mapRowToAnswer(results);
                answers.add(answer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (answers.isEmpty()) {
            return null;

        }


        Random random = new Random();
        return answers.get(random.nextInt(answers.size()));

    }
    private Answer mapRowToAnswer(SqlRowSet rs) {
        Answer answer = new Answer();
        answer.setAnswer(rs.getString("answers"));
        answer.setCategory(rs.getInt("category"));
        return answer;
    }
}




