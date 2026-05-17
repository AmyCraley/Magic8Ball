package com.amy.magic;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcCategoryDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcCategoryDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getCategoryIdByTitle(String title) {
        String sql = """
                SELECT id
                FROM categories
                WHERE LOWER(title) = LOWER(?)
                """;
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, title);

        if(results.next()) {
            return results.getInt("id");
        }
throw new RuntimeException("Category not found");
    }

}
