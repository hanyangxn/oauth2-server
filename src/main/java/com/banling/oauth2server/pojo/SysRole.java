package com.banling.oauth2server.pojo;


import java.io.Serializable;

public class SysRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    // 省略getter/setter

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

