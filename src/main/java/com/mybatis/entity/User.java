package com.mybatis.entity;

import java.io.Serializable;

/**
 * Created by admin on 2018/6/8.
 */
public class User implements Serializable {

    private static final long serialVersionUID = -7318295289166409650L;

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
