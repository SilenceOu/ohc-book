package com.ohc.controller;

import com.ohc.pojo.User;
import com.ohc.result.Result;
import com.ohc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;


/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2022/1/22 17:19
 */
@RestController
public class LoginController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "api/login")
    public Result login(@RequestBody User requestUser, HttpSession session) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        User user = userService.get(username, requestUser.getPassword());
        if (null == user) {
            return new Result(400);
        } else {
            session.setAttribute("user", user);
            return new Result(200);
        }
    }

}
