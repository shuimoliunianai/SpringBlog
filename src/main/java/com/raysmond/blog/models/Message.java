package com.raysmond.blog.models;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by daozi on 2017/12/19 0019.
 */
@Getter
@Setter
public class Message {
    private int id;
    private String message;
    private UserInfo userInfo;
}
