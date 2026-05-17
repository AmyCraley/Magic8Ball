package com.amy.magic;

import org.springframework.web.bind.annotation.*;
import com.amy.magic.JdbcAnswersDao;

@RestController
@RequestMapping( path = "/api/answer")
public class AnswersController {
    
    private final JdbcAnswersDao answersDao;
    private final JdbcCategoryDao categoryDao;

    public AnswersController(JdbcAnswersDao answersDao, JdbcCategoryDao categoryDao) {
        this.answersDao = answersDao;
        this.categoryDao = categoryDao;
    }

    // Example: http://localhost:8080/api/answers/classic
    @GetMapping("/{category}")
    public Answer getAnswer(@PathVariable String category) {

     int categoryId = categoryDao.getCategoryIdByTitle(category);
 return answersDao.getRandomAnswerByCategory(categoryId);

    }
}