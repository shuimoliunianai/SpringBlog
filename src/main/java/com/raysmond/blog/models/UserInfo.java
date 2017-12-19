package com.raysmond.blog.models;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by daozi on 2017/12/19 0019.
 */
@Getter
@Setter
public class UserInfo {
    private String userName;
    private int age;

    public UserInfo(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }
}
