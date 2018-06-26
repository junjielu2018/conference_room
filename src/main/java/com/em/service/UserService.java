package com.em.service;

import com.em.domain.User;

/**
 * Created by lujunjie on 2018/6/26.
 */
public interface UserService {

    /**
     * 根据Id查找用户
     * @param id
     * @return
     * @throws Exception
     */
    public User findUserById(String id) throws Exception;

    /**
     * 添加新用户
     * @param user
     * @throws Exception
     */
    public void addNewUser(User user) throws Exception;
}
