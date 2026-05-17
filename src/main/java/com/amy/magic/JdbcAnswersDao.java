package com.amy.magic;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


@Component
public class JdbcAnswersDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcAnswersDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public Answer getRandomAnswerByCategory(int categoryId) {

        ArrayList<Answer> answers = new ArrayList<>();
        String sql = """
                SELECT id, answer, category_id
                FROM magic8ball
                WHERE category_id = ?
                ORDER BY RANDOM()
                LIMIT 1
                """;


        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, categoryId);

        if (results.next()) {
            return mapRowToAnswer(results);
        }

        return null;
    }

        private Answer mapRowToAnswer (SqlRowSet rowSet){
            Answer answer = new Answer();

            answer.setId(rowSet.getInt("id"));
            answer.setAnswer(rowSet.getString("answers"));
            answer.setCategoryId(rowSet.getInt("category_id"));

            return answer;
        }
    }




