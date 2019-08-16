package com.baizhi;

import com.baizhi.entity.Book;
import com.baizhi.service.BookService;
import com.netflix.discovery.converters.Auto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookApplicationTests {
    @Autowired
    private BookService bookService;
    @Test
    public void selectNew(){
        List<Book> books = bookService.newBook();
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
