package com.amy.magic;

import org.springframework.web.bind.annotation.*;
import com.amy.magic.JdbcAnswersDao;

@RestController
@RequestMapping( path = "/api/answer")
public class AnswersController {
    
    private final JdbcAnswersDao answersDao;

    public AnswersController(JdbcAnswersDao answersDao) {
        this.answersDao = answersDao;
    }

    // Example: http://localhost:8080/api/answers/1
    @GetMapping("/{category}")

    public Answer getAnswer(@PathVariable String category) {
        int categoryId;

        switch (category.toLowerCase()) {
            case "classic":
                categoryId = 1;
                break;
            case "coding":
                categoryId = 2;
                break;
            case "artist":
                categoryId = 3;
                break;
            default:
                throw new RuntimeException("Category does not exist");
        }

        return answersDao.getRandomAnswerByCategory(categoryId);
    }
}