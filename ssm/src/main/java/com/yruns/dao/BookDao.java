package com.yruns.dao;

import com.yruns.pojo.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {

    @Insert("insert into tb_book values(null, #{type}, #{name}, #{description});")
    public int save(Book book);

    @Update("update tb_book set type=#{type}, name=#{name}, description=#{description} where id=#{id};")
    public int update(Book book);

    @Delete("delete from tb_book where id=#{id};")
    public int delete(Integer id);

    @Select("select * from tb_book where id=#{id};")
    public Book selectById(Integer id);

    @Select("select * from tb_book;")
    public List<Book> selectAll();
}
