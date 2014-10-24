package com.example.litepaltest.model;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private int id;

    private String name;

    // News和Category是多对多的关系
    private final List<News> newsList = new ArrayList<News>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<News> getNewsList() {
        return newsList;
    }
}
