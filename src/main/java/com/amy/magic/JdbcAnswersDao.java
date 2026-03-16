package com.amy.magic;// package ?

//import com.techelevator.exception.DaoException;
//import com.techelevator.model.RegisterUserDto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;


@Component
public class JdbcAnswersDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcAnswersDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public Answer getRandomAnswerByCategory(int category) {
        ArrayList<Answer> answers = null;
        String sql = "SELECT * FROM magic8Ball WHERE category = ?"; //for user to choose category by number NO

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
            while (results.next()) {
                Answer answer = mapRowToUser(results);
                answers.add(answer);
            }
            return answers;
        }
        //No, it needs to return one random answer from the answer column with a category of 2, not the entire HashMap
    }


}


