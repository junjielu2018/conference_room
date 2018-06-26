package com.em.dao;

import com.em.domain.User;

/**
 * Created by lujunjie on 2018/6/26.
 */
public interface UserMapper {
    public User findUserById(String id);

    public void addNewUser(User user);
}
