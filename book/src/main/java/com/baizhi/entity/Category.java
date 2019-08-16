package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable {
    private String id;

    private String cateName;

    private Integer count;

    private String parentId;

    private Short levels;

    private static final long serialVersionUID = 1L;

}