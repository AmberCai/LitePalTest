package com.example.litepaltest.model;

import java.util.ArrayList;
import java.util.List;

import org.litepal.crud.DataSupport;

public class Category extends DataSupport {

    private int id;

    private String name;

    // News��Category�Ƕ�Զ�Ĺ�ϵ
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
