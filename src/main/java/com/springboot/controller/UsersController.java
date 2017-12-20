package com.springboot.controller;

import com.springboot.entity.Users;
import com.springboot.service.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 文江 on 2017/12/20.
 */
@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    public UsersServices usersServices;

    @RequestMapping("login")
    @ResponseBody
    public Users login(String userName){
        Users users = usersServices.login(userName);
        if(users!=null){
            System.out.println(users.getUsername());
        }
     return users;
    }
    @RequestMapping("index")
    public String index(){
       return "user/index";
    }
}
