package com.yruns;

import com.yruns.dao.BookDao;
import com.yruns.services.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * Apps
 */
public class Apps {
    public static void main(String[] args) {
        // 获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml.temp");

        // 获取bean
        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
        System.out.println(bookDao);

        BookService bookService = (BookService) ctx.getBean("bookService");
        System.out.println(bookService);

        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
//
//        System.out.println(dataSource);
    }
}
