package com.yuanhong.bootredis.model;

import java.io.Serializable;

public class Article implements Serializable {
    private static final long serialVersionUId = 1L;

    private Integer id;

    private String title;

    private String contents;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
