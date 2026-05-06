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
    public String test(@PathVariable String category) {
        return "OK: " + category;

    //public Answer getAnswer(@PathVariable String category) {

//        System.out.println("CATEGORY REQUESTED: " + category);
//
//        int categoryId = categoryDao.getCategoryIdByTitle(category);
//
//        System.out.println("CATEGORY ID FOUND: " + categoryId);
//
//        return answersDao.getRandomAnswerByCategory(categoryId);

    }
}