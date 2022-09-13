package com.yruns.dao.impl;

import com.yruns.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * BookDaoImpl
 */
@Repository("bookDao")
public class BookDaoImpl implements BookDao {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void save() {
        System.out.println("bookDao save...");
    }

    public void update() {
        System.out.println("update method!");
    }
}
