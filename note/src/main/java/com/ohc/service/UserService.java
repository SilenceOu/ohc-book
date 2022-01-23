package com.ohc.service;

import com.ohc.dao.UserDAO;

import com.ohc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2022/1/22 20:10
 */
@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public boolean isExist(String username) {
        User user = getByName(username);
        return null!=user;
    }

    public User getByName(String username) {
        return userDAO.findByUsername(username);
    }

    public User get(String username, String password){
        return userDAO.findByUsernameAndPassword(username, password);
    }

    public void add(User user) {
        userDAO.save(user);
    }
}

