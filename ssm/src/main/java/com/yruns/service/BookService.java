package com.yruns.service;

import com.yruns.pojo.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    /**
     * 保存
     */
    public boolean save(Book book);

    /**
     * 修改
     */
    public boolean update(Book book);

    /**
     * 按id删除
     */
    public boolean delete(Integer id);

    /**
     * 按id查询
     */
    public Book selectById(Integer id);

    /**
     * 查询全部
     */
    public List<Book> selectAll();
}
