package com.example.litepaltest.model;

/**
 * 表的关联---- 一对一关联的实现方式是用外键，多对一关联的实现方式也是用外键，多对多关联的实现方式是用中间表
 */

// 注意：litepal支持的是java.util.Data;而不是java.sql.Date;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.litepal.crud.DataSupport;

public class News extends DataSupport {
    // id这个字段可写可不写，因为litepal会自动生成id这个主键
    private int id;
    private String title;
    private String content;
    private Date publishDate;
    private int commentCount;

    // News和Introduction是一对一的关系，那就可以在News类中添加如下引用
    private Introduction introduction;

    // Comment和News是多对一的关系，因此News中应该包含多个Comment，而Comment中应该只有一个News
    private final List<Comment> commentList = new ArrayList<Comment>();

    // News和Category是多对多的关系
    private final List<Category> categoryList = new ArrayList<Category>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public Introduction getIntroduction() {
        return introduction;
    }

    public void setIntroduction(Introduction introduction) {
        this.introduction = introduction;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }
}
