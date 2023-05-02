package com.example.activi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

@SpringBootTest
class ActiviApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    void test() throws SQLException {
        System.out.println(jdbcTemplate);
    }

}
