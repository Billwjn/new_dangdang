package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="dd_book")
public class Book implements Serializable {
    @Id
    private String id;

    private String bookName;

    private String author;

    private BigDecimal price;

    private BigDecimal ddPrice;

    private String company;

    private Date publishTime;

    private String publicCount;

    private String isbn;

    private Date printTime;

    private String printCount;

    private Integer saleCount;

    private String cateId;

    private String eRecommend;

    private String src;

    private String bookNum;

    private String bookKb;

    private String bookPaper;

    private String bookPrint;

    private String bookBz;

    private String bookTz;

    private Integer saveCount;

    private String bookDesc;

    private static final long serialVersionUID = 1L;
}