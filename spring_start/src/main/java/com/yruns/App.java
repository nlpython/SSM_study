package com.yruns;

import com.yruns.config.SpringConfig;
import com.yruns.dao.BookDao;
import com.yruns.services.BookService;
import com.yruns.services.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * App    纯注解开发
 */
public class App {
    public static void main(String[] args) {
        // 获取IoC容器
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        // 获取bean
        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
//        System.out.println(bookDao);

        bookDao.update();

//        BookService bookService = (BookService) ctx.getBean("bookService");
//        System.out.println(bookService);

//        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
//
//        System.out.println(dataSource);
    }
}
