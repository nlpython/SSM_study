package com.yruns.service;

import com.yruns.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * BookServiceTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    BookService bookService;

    @Test
    public void testSelectById() {
        System.out.println(bookService.selectById(2));
    }

    @Test
    public void testSelectAll() {
        System.out.println(bookService.selectAll());
    }
}
