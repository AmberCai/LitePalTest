package com.example.litepaltest.model;

import java.util.Date;

import org.litepal.crud.DataSupport;

public class Comment extends DataSupport {

    private int id;

    private String content;

    private Date publishDate;

    // Comment��News�Ƕ��һ�Ĺ�ϵ�����News��Ӧ�ð������Comment����Comment��Ӧ��ֻ��һ��News
    private News news;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

}
