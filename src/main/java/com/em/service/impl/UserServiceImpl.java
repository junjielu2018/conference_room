package com.em.service.impl;

import com.em.dao.UserMapper;
import com.em.domain.User;
import com.em.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lujunjie on 2018/6/26.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserById(String id) throws Exception {
        return userMapper.findUserById(id);
    }

    public void addNewUser(User user) throws Exception {
        userMapper.addNewUser(user);
    }
}
