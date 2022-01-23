package com.ohc.dao;

import com.ohc.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2022/1/22 19:57
 */
public interface UserDAO extends JpaRepository<User,Integer> {
    User findByUsername(String username);

    User findByUsernameAndPassword(String username,String password);
}
