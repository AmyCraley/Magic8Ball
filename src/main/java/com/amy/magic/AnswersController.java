package com.amy.magic;

import org.springframework.web.bind.annotation.*;
import com.amy.magic.JdbcAnswersDao;

@RestController
@RequestMapping( path = "/api/answers")
public class AnswersController {
;;
    private final JdbcAnswersDao answersDao;

    public AnswersController(JdbcAnswersDao answersDao) {
        this.answersDao = answersDao;
    }

    // Example: http://localhost:8080/api/answers/1
    @GetMapping("/{category}")

    public Answer getAnswer(@PathVariable int category) {
        Answer answer = answersDao.getRandomAnswerByCategory(category);

        if (answer == null) {
            throw new RuntimeException("No answers found for category " + category);
        }
        return answer;
    }

}
