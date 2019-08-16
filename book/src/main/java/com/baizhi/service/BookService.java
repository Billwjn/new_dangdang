package com.baizhi.service;

import com.baizhi.entity.Book;

import java.util.List;

public interface BookService {
    // 最新上架
    public List<Book> newBook();
    // 编辑推荐
    public List<Book> recommend();
    // 新书热卖
    public List<Book> newHotBook();
    // 畅销图书
    public List<Book> bestSellBook();
    // 图书详情
    public Book bookDetails(String id);
    // 根据一级分类查询图书
    public List<Book> booksByFirstCategory(String id);
    // 根据二级分类查询图书
    public List<Book> booksBySecondCategory(String id);
}
