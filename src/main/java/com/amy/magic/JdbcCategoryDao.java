package com.amy.magic;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcCategoryDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcCategoryDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getCategoryIdByTitle(String title) {
        String sql = "SELECT id FROM categories WHERE LOWER(title) = LOWER(?)";
        return jdbcTemplate.queryForObject(sql, Integer );
    }

}
