package com.example.litepaltest.model;

/**
 * ��Ĺ���---- һ��һ������ʵ�ַ�ʽ������������һ������ʵ�ַ�ʽҲ�����������Զ������ʵ�ַ�ʽ�����м��
 */

// ע�⣺litepal֧�ֵ���java.util.Data;������java.sql.Date;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.litepal.crud.DataSupport;

public class News extends DataSupport {
    // id����ֶο�д�ɲ�д����Ϊlitepal���Զ�����id�������
    private int id;
    private String title;
    private String content;
    private Date publishDate;
    private int commentCount;

    // News��Introduction��һ��һ�Ĺ�ϵ���ǾͿ�����News���������������
    private Introduction introduction;

    // Comment��News�Ƕ��һ�Ĺ�ϵ�����News��Ӧ�ð������Comment����Comment��Ӧ��ֻ��һ��News
    private final List<Comment> commentList = new ArrayList<Comment>();

    // News��Category�Ƕ�Զ�Ĺ�ϵ
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
