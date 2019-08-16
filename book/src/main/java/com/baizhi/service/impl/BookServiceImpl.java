package com.baizhi.service.impl;

import com.baizhi.dao.BookDao;
import com.baizhi.entity.Book;
import com.baizhi.service.BookService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Book> newBook() {
        Example example = new Example(Book.class);
        example.setOrderByClause("PUBLISH_TIME DESC");
        List<Book> books = bookDao.selectByExampleAndRowBounds(example, new RowBounds(0, 8));
        return books;
    }

    @Override
    public List<Book> recommend() {
        return null;
    }

    @Override
    public List<Book> newHotBook() {
        return null;
    }

    @Override
    public List<Book> bestSellBook() {
        return null;
    }

    @Override
    public Book bookDetails(String id) {
        return null;
    }

    @Override
    public List<Book> booksByFirstCategory(String id) {
        return null;
    }

    @Override
    public List<Book> booksBySecondCategory(String id) {
        return null;
    }
}
