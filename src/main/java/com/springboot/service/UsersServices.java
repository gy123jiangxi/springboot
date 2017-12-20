package com.springboot.service;

import com.springboot.dao.UsersDao;
import com.springboot.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 文江 on 2017/12/20.
 */
@Service
public class UsersServices {
    @Autowired
    private UsersDao usersDao;

    public Users login(String userName) {
        return usersDao.findUserByName(userName);
    }
}
