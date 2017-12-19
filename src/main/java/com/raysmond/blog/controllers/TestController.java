package com.raysmond.blog.controllers;

import com.raysmond.blog.models.Message;
import com.raysmond.blog.models.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daozi on 2017/12/19 0019.
 */
@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public Message index(){
        Message message = new Message();
        UserInfo userInfo = new UserInfo("test",1);
        message.setId(1);
        message.setMessage("test");
        message.setUserInfo(userInfo);
        return message;
    }
}
