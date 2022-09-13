package com.yruns.factory;

import com.yruns.dao.BookDao;
import com.yruns.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.FactoryBean;


/**
 * BookDaoFactoryBean
 */
public class BookDaoFactoryBean implements FactoryBean<BookDao> {


    public BookDao getObject() throws Exception {
        return new BookDaoImpl();
    }

    public Class<?> getObjectType() {
        return BookDao.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
