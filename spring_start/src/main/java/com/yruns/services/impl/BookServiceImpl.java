package com.yruns.services.impl;

import com.yruns.dao.BookDao;
import com.yruns.dao.impl.BookDaoImpl;
import com.yruns.services.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * BookServiceImpl
 */
@Service("bookService")
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
